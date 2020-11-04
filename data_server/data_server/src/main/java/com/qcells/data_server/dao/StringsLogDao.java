package com.qcells.data_server.dao;

import com.qcells.data_server.dto.StringsLog;
import org.springframework.stereotype.Repository;

@Repository
public interface StringsLogDao {
	public int insertStrings(StringsLog stringsLog);
}
