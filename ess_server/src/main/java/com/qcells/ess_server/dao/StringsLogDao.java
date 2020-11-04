package com.qcells.ess_server.dao;

import com.qcells.ess_server.dto.StringsLog;
import org.springframework.stereotype.Repository;

@Repository
public interface StringsLogDao {
	public int insertStrings(StringsLog stringsLog);
}
