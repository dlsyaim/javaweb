package com.ks.monitor.pojo;

import java.util.Date;

public class FnTraceGettable {
    private Integer databaseID;

    private Long transactionID;

    private Integer lineNumber;

    private String NTUserName;

    private String NTDomainName;

    private String hostName;

    private Integer clientProcessID;

    private String applicationName;

    private String loginName;

    private Integer SPID;

    private Long duration;

    private Date startTime;

    private Date endTime;

    private Long reads;

    private Long writes;

    private Integer CPU;

    private Long permissions;

    private Integer severity;

    private Integer eventSubClass;

    private Integer objectID;

    private Integer success;

    private Integer indexID;

    private Integer integerData;

    private String serverName;

    private Integer eventClass;

    private Integer objectType;

    private Integer nestLevel;

    private Integer state;

    private Integer error;

    private Integer mode;

    private Integer handle;

    private String objectName;

    private String databaseName;

    private String fileName;

    private String ownerName;

    private String roleName;

    private String targetUserName;

    private String DBUserName;

    private String targetLoginName;

    private Integer columnPermissions;

    private String linkedServerName;

    private String providerName;

    private String methodName;

    private Long rowCounts;

    private Integer requestID;

    private Long xactSequence;

    private Long eventSequence;

    private Long bigintData1;

    private Long bigintData2;

    private String GUID;

    private Integer integerData2;

    private Long objectID2;

    private Integer type;

    private Integer ownerID;

    private String parentName;

    private Integer isSystem;

    private Integer offset;

    private Integer sourceDatabaseID;

    private String sessionLoginName;

    private Integer groupID;

    public Integer getDatabaseID() {
        return databaseID;
    }

    public void setDatabaseID(Integer databaseID) {
        this.databaseID = databaseID;
    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getNTUserName() {
        return NTUserName;
    }

    public void setNTUserName(String NTUserName) {
        this.NTUserName = NTUserName == null ? null : NTUserName.trim();
    }

    public String getNTDomainName() {
        return NTDomainName;
    }

    public void setNTDomainName(String NTDomainName) {
        this.NTDomainName = NTDomainName == null ? null : NTDomainName.trim();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public Integer getClientProcessID() {
        return clientProcessID;
    }

    public void setClientProcessID(Integer clientProcessID) {
        this.clientProcessID = clientProcessID;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public Integer getSPID() {
        return SPID;
    }

    public void setSPID(Integer SPID) {
        this.SPID = SPID;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getReads() {
        return reads;
    }

    public void setReads(Long reads) {
        this.reads = reads;
    }

    public Long getWrites() {
        return writes;
    }

    public void setWrites(Long writes) {
        this.writes = writes;
    }

    public Integer getCPU() {
        return CPU;
    }

    public void setCPU(Integer CPU) {
        this.CPU = CPU;
    }

    public Long getPermissions() {
        return permissions;
    }

    public void setPermissions(Long permissions) {
        this.permissions = permissions;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public Integer getEventSubClass() {
        return eventSubClass;
    }

    public void setEventSubClass(Integer eventSubClass) {
        this.eventSubClass = eventSubClass;
    }

    public Integer getObjectID() {
        return objectID;
    }

    public void setObjectID(Integer objectID) {
        this.objectID = objectID;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Integer getIndexID() {
        return indexID;
    }

    public void setIndexID(Integer indexID) {
        this.indexID = indexID;
    }

    public Integer getIntegerData() {
        return integerData;
    }

    public void setIntegerData(Integer integerData) {
        this.integerData = integerData;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Integer getEventClass() {
        return eventClass;
    }

    public void setEventClass(Integer eventClass) {
        this.eventClass = eventClass;
    }

    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public Integer getNestLevel() {
        return nestLevel;
    }

    public void setNestLevel(Integer nestLevel) {
        this.nestLevel = nestLevel;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getHandle() {
        return handle;
    }

    public void setHandle(Integer handle) {
        this.handle = handle;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getTargetUserName() {
        return targetUserName;
    }

    public void setTargetUserName(String targetUserName) {
        this.targetUserName = targetUserName == null ? null : targetUserName.trim();
    }

    public String getDBUserName() {
        return DBUserName;
    }

    public void setDBUserName(String DBUserName) {
        this.DBUserName = DBUserName == null ? null : DBUserName.trim();
    }

    public String getTargetLoginName() {
        return targetLoginName;
    }

    public void setTargetLoginName(String targetLoginName) {
        this.targetLoginName = targetLoginName == null ? null : targetLoginName.trim();
    }

    public Integer getColumnPermissions() {
        return columnPermissions;
    }

    public void setColumnPermissions(Integer columnPermissions) {
        this.columnPermissions = columnPermissions;
    }

    public String getLinkedServerName() {
        return linkedServerName;
    }

    public void setLinkedServerName(String linkedServerName) {
        this.linkedServerName = linkedServerName == null ? null : linkedServerName.trim();
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName == null ? null : providerName.trim();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public Long getRowCounts() {
        return rowCounts;
    }

    public void setRowCounts(Long rowCounts) {
        this.rowCounts = rowCounts;
    }

    public Integer getRequestID() {
        return requestID;
    }

    public void setRequestID(Integer requestID) {
        this.requestID = requestID;
    }

    public Long getXactSequence() {
        return xactSequence;
    }

    public void setXactSequence(Long xactSequence) {
        this.xactSequence = xactSequence;
    }

    public Long getEventSequence() {
        return eventSequence;
    }

    public void setEventSequence(Long eventSequence) {
        this.eventSequence = eventSequence;
    }

    public Long getBigintData1() {
        return bigintData1;
    }

    public void setBigintData1(Long bigintData1) {
        this.bigintData1 = bigintData1;
    }

    public Long getBigintData2() {
        return bigintData2;
    }

    public void setBigintData2(Long bigintData2) {
        this.bigintData2 = bigintData2;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID == null ? null : GUID.trim();
    }

    public Integer getIntegerData2() {
        return integerData2;
    }

    public void setIntegerData2(Integer integerData2) {
        this.integerData2 = integerData2;
    }

    public Long getObjectID2() {
        return objectID2;
    }

    public void setObjectID2(Long objectID2) {
        this.objectID2 = objectID2;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Integer ownerID) {
        this.ownerID = ownerID;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    public Integer getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getSourceDatabaseID() {
        return sourceDatabaseID;
    }

    public void setSourceDatabaseID(Integer sourceDatabaseID) {
        this.sourceDatabaseID = sourceDatabaseID;
    }

    public String getSessionLoginName() {
        return sessionLoginName;
    }

    public void setSessionLoginName(String sessionLoginName) {
        this.sessionLoginName = sessionLoginName == null ? null : sessionLoginName.trim();
    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }
}