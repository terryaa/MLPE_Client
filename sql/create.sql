create role administrator with createdb createrole noinherit bypassrls connection limit 2 login password 'qcell#2020';
create role web_server with login password 'qcell#front';
create role http_server with login password 'qcell#http';
create database intern_project owner administrator;

create schema ;

grant ALL PRIVILEGES on schema  to web_server;
grant ALL PRIVILEGES on schema  to http_server;
grant ALL PRIVILEGES on schema  to administrator;

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA  TO web_server;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA  TO http_server;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA  TO administrator;
CREATE TABLE devices
(
    dv_id        INT      NOT NULL, 
    information  JSONB    NOT NULL, 
    PRIMARY KEY (dv_id)
);
CREATE TABLE gateway_log
(
    gt_id                 SMALLINT       NOT NULL    ,
    startTs               TIMESTAMP with time zone      NOT NULL    , 
    endTs                 TIMESTAMP with time zone      NOT NULL    , 
    mac_fix               VARCHAR(18)    NOT NULL, 
    sn_fix                VARCHAR(10)    NOT NULL, 
    software_version_fix  VARCHAR(5)     NOT NULL, 
    ioboard_fix           VARCHAR(1)     NOT NULL,
    PRIMARY KEY(gt_id,endts)
);
CREATE TABLE modules_log
(
    md_sn              INT          NOT NULL,
    st_id              SMALLINT     NOT NULL, 
    gt_id              SMALLINT     NOT NULL, 
    startTs            TIMESTAMP with time zone   NOT NULL, 
    endTs              TIMESTAMP with time zone   NOT NULL, 
    moduleVoltage      FLOAT(1)     NOT NULL, 
    moduleTemperature  FLOAT(1)     NOT NULL,
    modulewatt         SMALLINT     NOT NULL,
    modulecurrent      FLOAT(1)     NOT NULL,
    PRIMARY KEY(gt_id,st_id,md_sn,endts)
);
CREATE TABLE strings_log
(
    gt_id                 SMALLINT       NOT NULL,
    st_id                 SMALLINT       NOT NULL, 
    startTs               TIMESTAMP with time zone     NOT NULL, 
    endTs                 TIMESTAMP with time zone     NOT NULL, 
    portError             VARCHAR(8)     NOT NULL, 
    host_fix              VARCHAR(15)    NOT NULL, 
    port_fix              SMALLINT       NOT NULL,
    name_fix              VARCHAR(10)    NOT NULL, 
    serialNo_fix          SMALLINT       NOT NULL, 
    fwVersion_fix         VARCHAR(4)     NOT NULL, 
    comparator_fix        SMALLINT       NOT NULL, 
    devider_fix           SMALLINT       NOT NULL, 
    rawPulsesCounter_fix  SMALLINT       NOT NULL, 
    error                 VARCHAR(8)     NOT NULL, 
    stringVoltage         SMALLINT       NOT NULL,
    stringCurrent         FLOAT(3)       NOT NULL, 
    temperature           SMALLINT       NOT NULL, 
    totalWh               INT            NOT NULL,
    PRIMARY KEY(gt_id,st_id,endts)
);



select create_hypertable('gateway_log','endts',chunk_time_interval=>interval '1 hour');
select create_hypertable('strings_log','endts',chunk_time_interval=>interval '1 hour');
select create_hypertable('modules_log','endts',chunk_time_interval=>interval '1 hour');

--역방향
create index on gateway_log(endts,gt_id);
create index on strings_log(endts,gt_id,st_id);
create index on modules_log(endts,gt_id,st_id,md_sn);

drop table gateway_log;
drop table strings_log;
drop table modules_log;
commit;

insert into gateway_log values(1,to_timestamp(1596602413354/1000),to_timestamp(1596602414194/1000),'66:33:ad:7f:3b:75','7.2.002210','1.0.0','3');
insert into gateway_log values(2,to_timestamp(1596602414248/1000),to_timestamp(1596602417808/1000),'77:33:ad:7f:3b:75','7.2.002211','1.0.0','3');
insert into gateway_log values(3,to_timestamp(1596602417074/1000),to_timestamp(1596602422056/1000),'88:33:ad:7f:3b:75','7.2.002212','1.0.0','3');
insert into gateway_log values(4,to_timestamp(1596602416213/1000),to_timestamp(1596602426706/1000),'99:33:ad:7f:3b:75','7.2.002213','1.0.0','3');
insert into gateway_log values(5,to_timestamp(1596602410749/1000),to_timestamp(1596602411113/1000),'66:44:ad:7f:3b:75','7.2.002214','1.0.0','3');
insert into gateway_log values(6,to_timestamp(1596602413808/1000),to_timestamp(1596602415914/1000),'66:55:ad:7f:3b:75','7.2.002215','1.0.0','3');
insert into gateway_log values(7,to_timestamp(1596602417190/1000),to_timestamp(1596602420131/1000),'66:77:ad:7f:3b:75','7.2.002216','1.0.0','3');
insert into gateway_log values(8,to_timestamp(1596602416215/1000),to_timestamp(1596602421778/1000),'66:88:ad:7f:3b:75','7.2.002217','1.0.0','3');

insert into gateway_log values(1,to_timestamp(1596602562797/1000),to_timestamp(1596602486258/1000),'66:33:ad:7f:3b:75','7.2.002218','1.0.0','3');
insert into gateway_log values(2,to_timestamp(1596602477225/1000),to_timestamp(1596602478227/1000),'77:33:ad:7f:3b:75','7.2.002219','1.0.0','3');
insert into gateway_log values(3,to_timestamp(1596602477074/1000),to_timestamp(1596602486240/1000),'88:33:ad:7f:3b:75','7.2.002220','1.0.0','3');
insert into gateway_log values(4,to_timestamp(1596602483078/1000),to_timestamp(1596602486802/1000),'99:33:ad:7f:3b:75','7.2.002221','1.0.0','3');
insert into gateway_log values(5,to_timestamp(1596602484178/1000),to_timestamp(1596602486321/1000),'66:44:ad:7f:3b:75','7.2.002222','1.0.0','3');
insert into gateway_log values(6,to_timestamp(1596602473728/1000),to_timestamp(1596602474262/1000),'66:55:ad:7f:3b:75','7.2.002223','1.0.0','3');
insert into gateway_log values(7,to_timestamp(1596602481701/1000),to_timestamp(1596602485873/1000),'66:77:ad:7f:3b:75','7.2.002224','1.0.0','3');
insert into gateway_log values(8,to_timestamp(1596602485056/1000),to_timestamp(1596602488156/1000),'66:88:ad:7f:3b:75','7.2.002225','1.0.0','3');

insert into gateway_log values(1,to_timestamp(1596602562797/1000),to_timestamp(1596602546258/1000),'66:33:ad:7f:3b:75','7.2.002218','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602477225/1000),to_timestamp(1596602608227/1000),'77:33:ad:7f:3b:75','7.2.002219','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602477074/1000),to_timestamp(1596602666240/1000),'88:33:ad:7f:3b:75','7.2.002220','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602483078/1000),to_timestamp(1596602726802/1000),'99:33:ad:7f:3b:75','7.2.002221','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602484178/1000),to_timestamp(1596602786321/1000),'66:44:ad:7f:3b:75','7.2.002222','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602473728/1000),to_timestamp(1596602844262/1000),'66:55:ad:7f:3b:75','7.2.002223','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602481701/1000),to_timestamp(1596602915873/1000),'66:77:ad:7f:3b:75','7.2.002224','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602485056/1000),to_timestamp(1596602978156/1000),'66:88:ad:7f:3b:75','7.2.002225','1.0.0','3');

insert into gateway_log values(1,to_timestamp(1596602562797/1000),to_timestamp(1596603206258/1000),'66:33:ad:7f:3b:75','7.2.002218','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602477225/1000),to_timestamp(1596603268227/1000),'77:33:ad:7f:3b:75','7.2.002219','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602477074/1000),to_timestamp(1596603326240/1000),'88:33:ad:7f:3b:75','7.2.002220','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602483078/1000),to_timestamp(1596603386802/1000),'99:33:ad:7f:3b:75','7.2.002221','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602484178/1000),to_timestamp(1596603446321/1000),'66:44:ad:7f:3b:75','7.2.002222','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602473728/1000),to_timestamp(1596603504262/1000),'66:55:ad:7f:3b:75','7.2.002223','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602481701/1000),to_timestamp(1596603565873/1000),'66:77:ad:7f:3b:75','7.2.002224','1.0.0','3');
insert into gateway_log values(1,to_timestamp(1596602485056/1000),to_timestamp(1596603628156/1000),'66:88:ad:7f:3b:75','7.2.002225','1.0.0','3');

insert into gateway_log values(1,to_timestamp(1596602562797/1000),to_timestamp(1596602546258/1000),'66:33:ad:7f:3b:75','7.2.002218','1.0.0','3');
insert into gateway_log values(2,to_timestamp(1596602477225/1000),to_timestamp(1596602608227/1000),'77:33:ad:7f:3b:75','7.2.002219','1.0.0','3');
insert into gateway_log values(3,to_timestamp(1596602477074/1000),to_timestamp(1596602666240/1000),'88:33:ad:7f:3b:75','7.2.002220','1.0.0','3');
insert into gateway_log values(4,to_timestamp(1596602483078/1000),to_timestamp(1596602726802/1000),'99:33:ad:7f:3b:75','7.2.002221','1.0.0','3');
insert into gateway_log values(5,to_timestamp(1596602484178/1000),to_timestamp(1596602786321/1000),'66:44:ad:7f:3b:75','7.2.002222','1.0.0','3');
insert into gateway_log values(6,to_timestamp(1596602473728/1000),to_timestamp(1596602844262/1000),'66:55:ad:7f:3b:75','7.2.002223','1.0.0','3');
insert into gateway_log values(7,to_timestamp(1596602481701/1000),to_timestamp(1596602915873/1000),'66:77:ad:7f:3b:75','7.2.002224','1.0.0','3');
insert into gateway_log values(8,to_timestamp(1596602485056/1000),to_timestamp(1596602978156/1000),'66:88:ad:7f:3b:75','7.2.002225','1.0.0','3');

insert into gateway_log values(1,to_timestamp(1596602562797/1000),to_timestamp(1596603206258/1000),'66:33:ad:7f:3b:75','7.2.002218','1.0.0','3');
insert into gateway_log values(2,to_timestamp(1596602477225/1000),to_timestamp(1596603268227/1000),'77:33:ad:7f:3b:75','7.2.002219','1.0.0','3');
insert into gateway_log values(3,to_timestamp(1596602477074/1000),to_timestamp(1596603326240/1000),'88:33:ad:7f:3b:75','7.2.002220','1.0.0','3');
insert into gateway_log values(4,to_timestamp(1596602483078/1000),to_timestamp(1596603386802/1000),'99:33:ad:7f:3b:75','7.2.002221','1.0.0','3');
insert into gateway_log values(5,to_timestamp(1596602484178/1000),to_timestamp(1596603446321/1000),'66:44:ad:7f:3b:75','7.2.002222','1.0.0','3');
insert into gateway_log values(6,to_timestamp(1596602473728/1000),to_timestamp(1596603504262/1000),'66:55:ad:7f:3b:75','7.2.002223','1.0.0','3');
insert into gateway_log values(7,to_timestamp(1596602481701/1000),to_timestamp(1596603565873/1000),'66:77:ad:7f:3b:75','7.2.002224','1.0.0','3');
insert into gateway_log values(8,to_timestamp(1596602485056/1000),to_timestamp(1596603628156/1000),'66:88:ad:7f:3b:75','7.2.002225','1.0.0','3');



insert into strings_log values(1,1,to_timestamp(1596602416274/1000),to_timestamp(1596602485334/1000),'null','127.0.0.1',10002,'1-String-C',1112,2.33,9,0,7270,'null',951,0.022,26.0,1092898);
insert into strings_log values(1,2,to_timestamp(1596602413021/1000),to_timestamp(1596602546032/1000),'null','127.0.0.1',10002,'1-String-C',1333,2.33,9,0,7270,'null',582,2.022,31.0,1084052);
insert into strings_log values(2,3,to_timestamp(1596602411240/1000),to_timestamp(1596602483024/1000),'null','127.0.0.1',10002,'1-String-C',1144,2.33,9,0,7270,'null',753,3.045,23.0,1094582);
insert into strings_log values(2,4,to_timestamp(1596602416923/1000),to_timestamp(1596602548042/1000),'null','127.0.0.1',10002,'1-String-C',1155,2.33,9,0,7270,'null',594,2.122,25.0,1153898);
insert into strings_log values(3,5,to_timestamp(1596602412053/1000),to_timestamp(1596602485694/1000),'null','127.0.0.1',10002,'1-String-C',1166,2.33,9,0,7270,'null',715,4.678,26.0,1462898);
insert into strings_log values(3,6,to_timestamp(1596602416274/1000),to_timestamp(1596602545334/1000),'null','127.0.0.1',10002,'1-String-C',1177,2.33,9,0,7270,'null',406,1.931,27.0,1095292);
insert into strings_log values(4,7,to_timestamp(1596602413550/1000),to_timestamp(1596602487353/1000),'null','127.0.0.1',10002,'1-String-C',1188,2.33,9,0,7270,'null',857,1.053,25.0,1102891);
insert into strings_log values(4,8,to_timestamp(1596602411243/1000),to_timestamp(1596602545302/1000),'null','127.0.0.1',10002,'1-String-C',1199,2.33,9,0,7270,'null',788,4.678,24.0,1172478);

insert into strings_log values(1,1,to_timestamp(1596602486274/1000),to_timestamp(1596602609812/1000),'null','127.0.0.1',10002,'1-String-C',1112,2.33,9,0,7270,'null',501,1.192,25.0,1094023);
insert into strings_log values(1,2,to_timestamp(1596602474121/1000),to_timestamp(1596602665621/1000),'null','127.0.0.1',10002,'1-String-C',1113,2.33,9,0,7270,'null',692,3.312,32.0,1086953);
insert into strings_log values(2,3,to_timestamp(1596602487912/1000),to_timestamp(1596602603024/1000),'null','127.0.0.1',10002,'1-String-C',1114,2.33,9,0,7270,'null',783,2.585,21.0,1117582);
insert into strings_log values(2,4,to_timestamp(1596602476912/1000),to_timestamp(1596602669031/1000),'null','127.0.0.1',10002,'1-String-C',1115,2.33,9,0,7270,'null',814,4.182,22.0,1161391);
insert into strings_log values(3,5,to_timestamp(1596602473183/1000),to_timestamp(1596602607125/1000),'null','127.0.0.1',10002,'1-String-C',1116,2.33,9,0,7270,'null',755,1.448,27.0,1466311);
insert into strings_log values(3,6,to_timestamp(1596602479234/1000),to_timestamp(1596602665334/1000),'null','127.0.0.1',10002,'1-String-C',1117,2.33,9,0,7270,'null',316,3.641,24.0,1155162);
insert into strings_log values(4,7,to_timestamp(1596602484410/1000),to_timestamp(1596602607353/1000),'null','127.0.0.1',10002,'1-String-C',1118,2.33,9,0,7270,'null',789,2.733,28.0,1114627);
insert into strings_log values(4,8,to_timestamp(1596602471233/1000),to_timestamp(1596602665302/1000),'null','127.0.0.1',10002,'1-String-C',1119,2.33,9,0,7270,'null',812,4.158,25.0,1210328);

insert into modules_log values('20000001',1,1,to_timestamp(1596602425580/1000),to_timestamp(1596602426521/1000),28.4,31.4,40,30);
insert into modules_log values('20000002',1,1,to_timestamp(1596602425580/1000),to_timestamp(1596602426521/1000),29.5,30.1,10,20);
insert into modules_log values('20000003',1,1,to_timestamp(1596602425580/1000),to_timestamp(1596602426521/1000),26.7,28.4,16,23);
insert into modules_log values('20000004',2,1,to_timestamp(1596602424035/1000),to_timestamp(1596602425067/1000),24.4,27.9,64,45);
insert into modules_log values('20000005',2,1,to_timestamp(1596602424035/1000),to_timestamp(1596602425067/1000),25.2,24.8,85,24);
insert into modules_log values('20000006',2,1,to_timestamp(1596602424035/1000),to_timestamp(1596602425067/1000),27.8,27.7,66,12);
insert into modules_log values('20000007',3,2,to_timestamp(1596602427942/1000),to_timestamp(1596602429821/1000),22.7,26.6,56,12);
insert into modules_log values('20000008',3,2,to_timestamp(1596602427942/1000),to_timestamp(1596602429821/1000),25.6,28.5,74,12);
insert into modules_log values('20000009',3,2,to_timestamp(1596602427942/1000),to_timestamp(1596602429821/1000),27.4,24.1,67,42);
insert into modules_log values('20000010',4,2,to_timestamp(1596602423451/1000),to_timestamp(1596602426253/1000),28.3,29.2,89,01);
insert into modules_log values('20000011',4,2,to_timestamp(1596602423451/1000),to_timestamp(1596602426253/1000),30.2,25.3,96,06);
insert into modules_log values('20000012',4,2,to_timestamp(1596602423451/1000),to_timestamp(1596602426253/1000),31.1,26.4,34,02);

insert into modules_log values('20000004',2,1,to_timestamp(1596602424035/1000),to_timestamp(1596602425067/1000),24.4,27.9,64,45);
insert into modules_log values('20000005',2,1,to_timestamp(1596602424035/1000),to_timestamp(1596602425067/1000),25.2,24.8,85,24);
insert into modules_log values('20000006',2,1,to_timestamp(1596602424035/1000),to_timestamp(1596602425067/1000),27.8,27.7,66,12);
insert into modules_log values('20000007',3,2,to_timestamp(1596602427942/1000),to_timestamp(1596602429821/1000),22.7,26.6,56,12);
insert into modules_log values('20000008',3,2,to_timestamp(1596602427942/1000),to_timestamp(1596602429821/1000),25.6,28.5,74,12);
insert into modules_log values('20000009',3,2,to_timestamp(1596602427942/1000),to_timestamp(1596602429821/1000),27.4,24.1,67,42);
insert into modules_log values('20000010',4,2,to_timestamp(1596602423451/1000),to_timestamp(1596602426253/1000),28.3,29.2,89,01);
insert into modules_log values('20000011',4,2,to_timestamp(1596602423451/1000),to_timestamp(1596602426253/1000),30.2,25.3,96,06);
insert into modules_log values('20000012',4,2,to_timestamp(1596602423451/1000),to_timestamp(1596602426253/1000),31.1,26.4,34,02);

insert into modules_log values('20000001',1,1,to_timestamp(1596602483512/1000),to_timestamp(1596602567042/1000),23.4,29.8,71,83);
insert into modules_log values('20000002',1,1,to_timestamp(1596602483512/1000),to_timestamp(1596602627043/1000),25.4,25.7,33,57);
insert into modules_log values('20000003',1,1,to_timestamp(1596602483512/1000),to_timestamp(1596602687044/1000),27.6,27.6,24,16);
insert into modules_log values('20000004',2,1,to_timestamp(1596602481231/1000),to_timestamp(1596602748415/1000),28.4,22.3,16,72);
insert into modules_log values('20000005',2,1,to_timestamp(1596602481231/1000),to_timestamp(1596602808416/1000),21.3,21.2,88,81);
insert into modules_log values('20000006',2,1,to_timestamp(1596602481231/1000),to_timestamp(1596602868417/1000),22.2,28.1,88,13);
insert into modules_log values('20000007',3,2,to_timestamp(1596602488012/1000),to_timestamp(1596602921238/1000),23.1,29.8,17,92);
insert into modules_log values('20000008',3,2,to_timestamp(1596602488012/1000),to_timestamp(1596602981239/1000),21.5,27.9,17,87);
insert into modules_log values('20000009',3,2,to_timestamp(1596602488012/1000),to_timestamp(1596603041235/1000),22.1,21.4,84,18);
insert into modules_log values('20000010',4,2,to_timestamp(1596602484219/1000),to_timestamp(1596603109614/1000),23.2,28.3,36,82);
insert into modules_log values('20000011',4,2,to_timestamp(1596602484219/1000),to_timestamp(1596603169613/1000),36.3,21.2,22,92);
insert into modules_log values('20000012',4,2,to_timestamp(1596602484219/1000),to_timestamp(1596603229611/1000),36.4,22.1,11,89);

insert into modules_log values('20000001',1,1,to_timestamp(1596602483512/1000),to_timestamp(1596602547041/1000),26.4,30.8,51,23);
insert into modules_log values('20000002',1,1,to_timestamp(1596602483512/1000),to_timestamp(1596602607041/1000),22.4,31.7,83,07);
insert into modules_log values('20000003',1,1,to_timestamp(1596602483512/1000),to_timestamp(1596602667041/1000),21.6,27.6,64,56);
insert into modules_log values('20000004',2,1,to_timestamp(1596602481231/1000),to_timestamp(1596602728410/1000),25.4,25.3,76,12);
insert into modules_log values('20000005',2,1,to_timestamp(1596602481231/1000),to_timestamp(1596602788410/1000),27.3,23.2,38,11);
insert into modules_log values('20000006',2,1,to_timestamp(1596602481231/1000),to_timestamp(1596602848410/1000),27.2,24.1,68,43);
insert into modules_log values('20000007',3,2,to_timestamp(1596602488012/1000),to_timestamp(1596602901231/1000),28.1,26.8,87,12);
insert into modules_log values('20000008',3,2,to_timestamp(1596602488012/1000),to_timestamp(1596602961231/1000),24.5,23.9,97,57);
insert into modules_log values('20000009',3,2,to_timestamp(1596602488012/1000),to_timestamp(1596603021231/1000),29.1,27.4,14,78);
insert into modules_log values('20000010',4,2,to_timestamp(1596602484219/1000),to_timestamp(1596603089612/1000),27.2,25.3,56,22);
insert into modules_log values('20000011',4,2,to_timestamp(1596602484219/1000),to_timestamp(1596603149612/1000),31.3,27.2,64,12);
insert into modules_log values('20000012',4,2,to_timestamp(1596602484219/1000),to_timestamp(1596603209612/1000),30.4,28.1,56,19);

insert into modules_log values('20000001',1,1,to_timestamp(1596602483512/1000),to_timestamp(1596602547041/1000),26.4,30.8,51,23);
insert into modules_log values('20000002',1,1,to_timestamp(1596602483512/1000),to_timestamp(1596602607041/1000),22.4,31.7,83,07);
insert into modules_log values('20000003',1,1,to_timestamp(1596602483512/1000),to_timestamp(1596602667041/1000),21.6,27.6,64,56);
insert into modules_log values('20000004',2,1,to_timestamp(1596602481231/1000),to_timestamp(1596602728410/1000),25.4,25.3,76,12);
insert into modules_log values('20000005',2,1,to_timestamp(1596602481231/1000),to_timestamp(1596602788410/1000),27.3,23.2,38,11);
insert into modules_log values('20000006',2,1,to_timestamp(1596602481231/1000),to_timestamp(1596602848410/1000),27.2,24.1,68,43);
insert into modules_log values('20000007',3,2,to_timestamp(1596602488012/1000),to_timestamp(1596602901231/1000),28.1,26.8,87,12);
insert into modules_log values('20000008',3,2,to_timestamp(1596602488012/1000),to_timestamp(1596602961231/1000),24.5,23.9,97,57);
insert into modules_log values('20000009',3,2,to_timestamp(1596602488012/1000),to_timestamp(1596603021231/1000),29.1,27.4,14,78);
insert into modules_log values('20000010',4,2,to_timestamp(1596602484219/1000),to_timestamp(1596603089612/1000),27.2,25.3,56,22);
insert into modules_log values('20000011',4,2,to_timestamp(1596602484219/1000),to_timestamp(1596603149612/1000),31.3,27.2,64,12);
insert into modules_log values('20000012',4,2,to_timestamp(1596602484219/1000),to_timestamp(1596603209612/1000),30.4,28.1,56,19);

select * from gateway_log;
select * from strings_log;
select * from modules_log;

select time_bucket('1 minute',endts) as minute,
max(endts)from gateway_log
group by minute
order by minute desc;


select * from chunk_relation_size('gateway_log');


SELECT * FROM gateway_log where endts<=now() and endts>=now()-INTERVAL "15 minutes";


--DB설치후 실행순서
--create role,-> admin으로 로그인
--create database
--create tables
--create hypertable
--create index
--insert test data
--grant 
--select test