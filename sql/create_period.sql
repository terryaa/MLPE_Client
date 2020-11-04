CREATE TABLE gateway_log_quarter
(
    gt_id                 SMALLINT       NOT NULL    ,
    startTs               TIMESTAMP with time zone      NOT NULL    , 
    endTs                 TIMESTAMP with time zone      NOT NULL    , 
    mac_fix               VARCHAR(18)    NOT NULL, 
    sn_fix                VARCHAR(10)    NOT NULL, 
    software_version_fix  VARCHAR(5)     NOT NULL, 
    ioboard_fix           VARCHAR(1)     NOT NULL,
    totalWh_delta         INT            NOT NULL,
    watt_avg              FLOAT(1)       NOT NULL,
    PRIMARY KEY(gt_id,endts)
);
CREATE TABLE modules_log_quarter
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
    moduleVoltage_avg  FLOAT(1)     NOT NULL,
    moduleTemperature_avg FLOAT(1)  NOT NULL,
    modulewatt_avg     FLOAT(1)     NOT NULL,
    PRIMARY KEY(gt_id,st_id,md_sn,endts)
);
CREATE TABLE strings_log_quarter
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
    totalWh_delta         INT            NOT NULL,
    stringvoltage_avg     FLOAT(1)       NOT NULL,
    temperature_avg       FLOAT(1)       NOT NULL,
    stringwatt_avg              INT            NOT NULL,
    PRIMARY KEY(gt_id,st_id,endts)
);

insert into modules_log_quarter values('20000001',1,1,to_timestamp(1596602425580/1000),to_timestamp(1596602426521/1000),28.4,31.4,40,30,25.4,28.9,73.1);
insert into modules_log_quarter values('20000002',1,1,to_timestamp(1596602425580/1000),to_timestamp(1596602426521/1000),29.5,30.1,10,20,32.1,25.1,36.6);


CREATE TABLE gateway_log_hour
(
    gt_id                 SMALLINT       NOT NULL    ,
    startTs               TIMESTAMP with time zone      NOT NULL    , 
    endTs                 TIMESTAMP with time zone      NOT NULL    , 
    mac_fix               VARCHAR(18)    NOT NULL, 
    sn_fix                VARCHAR(10)    NOT NULL, 
    software_version_fix  VARCHAR(5)     NOT NULL, 
    ioboard_fix           VARCHAR(1)     NOT NULL,
    totalWh_delta         INT            NOT NULL,
    watt_avg              FLOAT(1)       NOT NULL,
    PRIMARY KEY(gt_id,endts)
);
CREATE TABLE modules_log_hour
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
    moduleVoltage_avg  FLOAT(1)     NOT NULL,
    moduleTemperature_avg FLOAT(1)  NOT NULL,
    modulewatt_avg     FLOAT(1)     NOT NULL,
    PRIMARY KEY(gt_id,st_id,md_sn,endts)
);
CREATE TABLE strings_log_hour
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
    totalWh_delta         INT            NOT NULL,
    stringvoltage_avg     FLOAT(1)       NOT NULL,
    temperature_avg       FLOAT(1)       NOT NULL,
    stringwatt_avg              INT            NOT NULL,
    PRIMARY KEY(gt_id,st_id,endts)
);
CREATE TABLE gateway_log_day
(
    gt_id                 SMALLINT       NOT NULL    ,
    startTs               TIMESTAMP with time zone      NOT NULL    , 
    endTs                 TIMESTAMP with time zone      NOT NULL    , 
    mac_fix               VARCHAR(18)    NOT NULL, 
    sn_fix                VARCHAR(10)    NOT NULL, 
    software_version_fix  VARCHAR(5)     NOT NULL, 
    ioboard_fix           VARCHAR(1)     NOT NULL,
    totalWh_delta         INT            NOT NULL,
    watt_avg              FLOAT(1)       NOT NULL,
    PRIMARY KEY(gt_id,endts)
);
CREATE TABLE modules_log_day
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
    moduleVoltage_avg  FLOAT(1)     NOT NULL,
    moduleTemperature_avg FLOAT(1)  NOT NULL,
    modulewatt_avg     FLOAT(1)     NOT NULL,
    PRIMARY KEY(gt_id,st_id,md_sn,endts)
);
CREATE TABLE strings_log_day
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
    totalWh_delta         INT            NOT NULL,
    stringvoltage_avg     FLOAT(1)       NOT NULL,
    temperature_avg       FLOAT(1)       NOT NULL,
    stringwatt_avg              INT            NOT NULL,
    PRIMARY KEY(gt_id,st_id,endts)
);