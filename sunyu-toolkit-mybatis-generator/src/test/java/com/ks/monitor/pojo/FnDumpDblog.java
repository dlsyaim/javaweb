package com.ks.monitor.pojo;

public class FnDumpDblog {
    private String current LSN;

    private String operation;

    private String context;

    private String transaction ID;

    private Long logBlockGeneration;

    private Short log Record Fixed Length;

    private Short log Record Length;

    private String previous LSN;

    private Integer log Reserve;

    private Long allocUnitId;

    private String allocUnitName;

    private String page ID;

    private Integer slot ID;

    private String previous Page LSN;

    private Long partitionId;

    private Short rowFlags;

    private Short num Elements;

    private Short offset in Row;

    private Short modify Size;

    private String checkpoint Begin;

    private Short CHKPT Begin DB Version;

    private String max XDESID;

    private Short num Transactions;

    private String checkpoint End;

    private Short CHKPT End DB Version;

    private String minimum LSN;

    private Integer dirty Pages;

    private String oldest Replicated Begin LSN;

    private String next Replicated End LSN;

    private String last Distributed Backup End LSN;

    private String last Distributed End LSN;

    private Integer server UID;

    private Integer SPID;

    private Integer xact Type;

    private String begin Time;

    private String transaction Name;

    private Long xact ID;

    private Integer xact Node ID;

    private Integer xact Node Local ID;

    private String end Time;

    private String transaction Begin;

    private Integer replicated Records;

    private String oldest Active LSN;

    private String server Name;

    private String database Name;

    private String mark Name;

    private String master XDESID;

    private Integer master DBID;

    private String preplog Begin LSN;

    private String prepare Time;

    private Long virtual Clock;

    private String previous Savepoint;

    private String savepoint Name;

    private Short rowbits First Bit;

    private Short rowbits Bit Count;

    private Short number of Locks;

    private String lock Information;

    private String LSN before writes;

    private Short pages Written;

    private Integer data Pages Delta;

    private Integer reserved Pages Delta;

    private Integer used Pages Delta;

    private Long data Rows Delta;

    private Integer command Type;

    private Integer publication ID;

    private Integer article ID;

    private Integer partial Status;

    private String command;

    private Short byte Offset;

    private String new Split Page;

    private Short rows Deleted;

    private Short bytes Freed;

    private Integer CI Table Id;

    private Short CI Index Id;

    private Long newAllocUnitId;

    private Short fileGroup ID;

    private Short file ID;

    private String physical Name;

    private String logical Name;

    private String format LSN;

    private Long rowsetId;

    private Integer column Offset;

    private Integer flags;

    private Long text Size;

    private Long offset;

    private Long old Size;

    private Long new Size;

    private String description;

    private Integer bulk allocated extent count;

    private Long bulk RowsetId;

    private Long bulk AllocUnitId;

    private String bulk allocation first IAM Page ID;

    private String bulk allocated extent ids;

    private Short compression Log Type;

    private Short pageFormat PageType;

    private Short pageFormat PageFlags;

    private Short pageFormat PageLevel;

    private Short pageFormat PageStat;

    private Short pageFormat FormatOption;

    public String getCurrent LSN() {
        return current LSN;
    }

    public void setCurrent LSN(String current LSN) {
        this.current LSN = current LSN == null ? null : current LSN.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getTransaction ID() {
        return transaction ID;
    }

    public void setTransaction ID(String transaction ID) {
        this.transaction ID = transaction ID == null ? null : transaction ID.trim();
    }

    public Long getLogBlockGeneration() {
        return logBlockGeneration;
    }

    public void setLogBlockGeneration(Long logBlockGeneration) {
        this.logBlockGeneration = logBlockGeneration;
    }

    public Short getLog Record Fixed Length() {
        return log Record Fixed Length;
    }

    public void setLog Record Fixed Length(Short log Record Fixed Length) {
        this.log Record Fixed Length = log Record Fixed Length;
    }

    public Short getLog Record Length() {
        return log Record Length;
    }

    public void setLog Record Length(Short log Record Length) {
        this.log Record Length = log Record Length;
    }

    public String getPrevious LSN() {
        return previous LSN;
    }

    public void setPrevious LSN(String previous LSN) {
        this.previous LSN = previous LSN == null ? null : previous LSN.trim();
    }

    public Integer getLog Reserve() {
        return log Reserve;
    }

    public void setLog Reserve(Integer log Reserve) {
        this.log Reserve = log Reserve;
    }

    public Long getAllocUnitId() {
        return allocUnitId;
    }

    public void setAllocUnitId(Long allocUnitId) {
        this.allocUnitId = allocUnitId;
    }

    public String getAllocUnitName() {
        return allocUnitName;
    }

    public void setAllocUnitName(String allocUnitName) {
        this.allocUnitName = allocUnitName == null ? null : allocUnitName.trim();
    }

    public String getPage ID() {
        return page ID;
    }

    public void setPage ID(String page ID) {
        this.page ID = page ID == null ? null : page ID.trim();
    }

    public Integer getSlot ID() {
        return slot ID;
    }

    public void setSlot ID(Integer slot ID) {
        this.slot ID = slot ID;
    }

    public String getPrevious Page LSN() {
        return previous Page LSN;
    }

    public void setPrevious Page LSN(String previous Page LSN) {
        this.previous Page LSN = previous Page LSN == null ? null : previous Page LSN.trim();
    }

    public Long getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Long partitionId) {
        this.partitionId = partitionId;
    }

    public Short getRowFlags() {
        return rowFlags;
    }

    public void setRowFlags(Short rowFlags) {
        this.rowFlags = rowFlags;
    }

    public Short getNum Elements() {
        return num Elements;
    }

    public void setNum Elements(Short num Elements) {
        this.num Elements = num Elements;
    }

    public Short getOffset in Row() {
        return offset in Row;
    }

    public void setOffset in Row(Short offset in Row) {
        this.offset in Row = offset in Row;
    }

    public Short getModify Size() {
        return modify Size;
    }

    public void setModify Size(Short modify Size) {
        this.modify Size = modify Size;
    }

    public String getCheckpoint Begin() {
        return checkpoint Begin;
    }

    public void setCheckpoint Begin(String checkpoint Begin) {
        this.checkpoint Begin = checkpoint Begin == null ? null : checkpoint Begin.trim();
    }

    public Short getCHKPT Begin DB Version() {
        return CHKPT Begin DB Version;
    }

    public void setCHKPT Begin DB Version(Short CHKPT Begin DB Version) {
        this.CHKPT Begin DB Version = CHKPT Begin DB Version;
    }

    public String getMax XDESID() {
        return max XDESID;
    }

    public void setMax XDESID(String max XDESID) {
        this.max XDESID = max XDESID == null ? null : max XDESID.trim();
    }

    public Short getNum Transactions() {
        return num Transactions;
    }

    public void setNum Transactions(Short num Transactions) {
        this.num Transactions = num Transactions;
    }

    public String getCheckpoint End() {
        return checkpoint End;
    }

    public void setCheckpoint End(String checkpoint End) {
        this.checkpoint End = checkpoint End == null ? null : checkpoint End.trim();
    }

    public Short getCHKPT End DB Version() {
        return CHKPT End DB Version;
    }

    public void setCHKPT End DB Version(Short CHKPT End DB Version) {
        this.CHKPT End DB Version = CHKPT End DB Version;
    }

    public String getMinimum LSN() {
        return minimum LSN;
    }

    public void setMinimum LSN(String minimum LSN) {
        this.minimum LSN = minimum LSN == null ? null : minimum LSN.trim();
    }

    public Integer getDirty Pages() {
        return dirty Pages;
    }

    public void setDirty Pages(Integer dirty Pages) {
        this.dirty Pages = dirty Pages;
    }

    public String getOldest Replicated Begin LSN() {
        return oldest Replicated Begin LSN;
    }

    public void setOldest Replicated Begin LSN(String oldest Replicated Begin LSN) {
        this.oldest Replicated Begin LSN = oldest Replicated Begin LSN == null ? null : oldest Replicated Begin LSN.trim();
    }

    public String getNext Replicated End LSN() {
        return next Replicated End LSN;
    }

    public void setNext Replicated End LSN(String next Replicated End LSN) {
        this.next Replicated End LSN = next Replicated End LSN == null ? null : next Replicated End LSN.trim();
    }

    public String getLast Distributed Backup End LSN() {
        return last Distributed Backup End LSN;
    }

    public void setLast Distributed Backup End LSN(String last Distributed Backup End LSN) {
        this.last Distributed Backup End LSN = last Distributed Backup End LSN == null ? null : last Distributed Backup End LSN.trim();
    }

    public String getLast Distributed End LSN() {
        return last Distributed End LSN;
    }

    public void setLast Distributed End LSN(String last Distributed End LSN) {
        this.last Distributed End LSN = last Distributed End LSN == null ? null : last Distributed End LSN.trim();
    }

    public Integer getServer UID() {
        return server UID;
    }

    public void setServer UID(Integer server UID) {
        this.server UID = server UID;
    }

    public Integer getSPID() {
        return SPID;
    }

    public void setSPID(Integer SPID) {
        this.SPID = SPID;
    }

    public Integer getXact Type() {
        return xact Type;
    }

    public void setXact Type(Integer xact Type) {
        this.xact Type = xact Type;
    }

    public String getBegin Time() {
        return begin Time;
    }

    public void setBegin Time(String begin Time) {
        this.begin Time = begin Time == null ? null : begin Time.trim();
    }

    public String getTransaction Name() {
        return transaction Name;
    }

    public void setTransaction Name(String transaction Name) {
        this.transaction Name = transaction Name == null ? null : transaction Name.trim();
    }

    public Long getXact ID() {
        return xact ID;
    }

    public void setXact ID(Long xact ID) {
        this.xact ID = xact ID;
    }

    public Integer getXact Node ID() {
        return xact Node ID;
    }

    public void setXact Node ID(Integer xact Node ID) {
        this.xact Node ID = xact Node ID;
    }

    public Integer getXact Node Local ID() {
        return xact Node Local ID;
    }

    public void setXact Node Local ID(Integer xact Node Local ID) {
        this.xact Node Local ID = xact Node Local ID;
    }

    public String getEnd Time() {
        return end Time;
    }

    public void setEnd Time(String end Time) {
        this.end Time = end Time == null ? null : end Time.trim();
    }

    public String getTransaction Begin() {
        return transaction Begin;
    }

    public void setTransaction Begin(String transaction Begin) {
        this.transaction Begin = transaction Begin == null ? null : transaction Begin.trim();
    }

    public Integer getReplicated Records() {
        return replicated Records;
    }

    public void setReplicated Records(Integer replicated Records) {
        this.replicated Records = replicated Records;
    }

    public String getOldest Active LSN() {
        return oldest Active LSN;
    }

    public void setOldest Active LSN(String oldest Active LSN) {
        this.oldest Active LSN = oldest Active LSN == null ? null : oldest Active LSN.trim();
    }

    public String getServer Name() {
        return server Name;
    }

    public void setServer Name(String server Name) {
        this.server Name = server Name == null ? null : server Name.trim();
    }

    public String getDatabase Name() {
        return database Name;
    }

    public void setDatabase Name(String database Name) {
        this.database Name = database Name == null ? null : database Name.trim();
    }

    public String getMark Name() {
        return mark Name;
    }

    public void setMark Name(String mark Name) {
        this.mark Name = mark Name == null ? null : mark Name.trim();
    }

    public String getMaster XDESID() {
        return master XDESID;
    }

    public void setMaster XDESID(String master XDESID) {
        this.master XDESID = master XDESID == null ? null : master XDESID.trim();
    }

    public Integer getMaster DBID() {
        return master DBID;
    }

    public void setMaster DBID(Integer master DBID) {
        this.master DBID = master DBID;
    }

    public String getPreplog Begin LSN() {
        return preplog Begin LSN;
    }

    public void setPreplog Begin LSN(String preplog Begin LSN) {
        this.preplog Begin LSN = preplog Begin LSN == null ? null : preplog Begin LSN.trim();
    }

    public String getPrepare Time() {
        return prepare Time;
    }

    public void setPrepare Time(String prepare Time) {
        this.prepare Time = prepare Time == null ? null : prepare Time.trim();
    }

    public Long getVirtual Clock() {
        return virtual Clock;
    }

    public void setVirtual Clock(Long virtual Clock) {
        this.virtual Clock = virtual Clock;
    }

    public String getPrevious Savepoint() {
        return previous Savepoint;
    }

    public void setPrevious Savepoint(String previous Savepoint) {
        this.previous Savepoint = previous Savepoint == null ? null : previous Savepoint.trim();
    }

    public String getSavepoint Name() {
        return savepoint Name;
    }

    public void setSavepoint Name(String savepoint Name) {
        this.savepoint Name = savepoint Name == null ? null : savepoint Name.trim();
    }

    public Short getRowbits First Bit() {
        return rowbits First Bit;
    }

    public void setRowbits First Bit(Short rowbits First Bit) {
        this.rowbits First Bit = rowbits First Bit;
    }

    public Short getRowbits Bit Count() {
        return rowbits Bit Count;
    }

    public void setRowbits Bit Count(Short rowbits Bit Count) {
        this.rowbits Bit Count = rowbits Bit Count;
    }

    public Short getNumber of Locks() {
        return number of Locks;
    }

    public void setNumber of Locks(Short number of Locks) {
        this.number of Locks = number of Locks;
    }

    public String getLock Information() {
        return lock Information;
    }

    public void setLock Information(String lock Information) {
        this.lock Information = lock Information == null ? null : lock Information.trim();
    }

    public String getLSN before writes() {
        return LSN before writes;
    }

    public void setLSN before writes(String LSN before writes) {
        this.LSN before writes = LSN before writes == null ? null : LSN before writes.trim();
    }

    public Short getPages Written() {
        return pages Written;
    }

    public void setPages Written(Short pages Written) {
        this.pages Written = pages Written;
    }

    public Integer getData Pages Delta() {
        return data Pages Delta;
    }

    public void setData Pages Delta(Integer data Pages Delta) {
        this.data Pages Delta = data Pages Delta;
    }

    public Integer getReserved Pages Delta() {
        return reserved Pages Delta;
    }

    public void setReserved Pages Delta(Integer reserved Pages Delta) {
        this.reserved Pages Delta = reserved Pages Delta;
    }

    public Integer getUsed Pages Delta() {
        return used Pages Delta;
    }

    public void setUsed Pages Delta(Integer used Pages Delta) {
        this.used Pages Delta = used Pages Delta;
    }

    public Long getData Rows Delta() {
        return data Rows Delta;
    }

    public void setData Rows Delta(Long data Rows Delta) {
        this.data Rows Delta = data Rows Delta;
    }

    public Integer getCommand Type() {
        return command Type;
    }

    public void setCommand Type(Integer command Type) {
        this.command Type = command Type;
    }

    public Integer getPublication ID() {
        return publication ID;
    }

    public void setPublication ID(Integer publication ID) {
        this.publication ID = publication ID;
    }

    public Integer getArticle ID() {
        return article ID;
    }

    public void setArticle ID(Integer article ID) {
        this.article ID = article ID;
    }

    public Integer getPartial Status() {
        return partial Status;
    }

    public void setPartial Status(Integer partial Status) {
        this.partial Status = partial Status;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    public Short getByte Offset() {
        return byte Offset;
    }

    public void setByte Offset(Short byte Offset) {
        this.byte Offset = byte Offset;
    }

    public String getNew Split Page() {
        return new Split Page;
    }

    public void setNew Split Page(String new Split Page) {
        this.new Split Page = new Split Page == null ? null : new Split Page.trim();
    }

    public Short getRows Deleted() {
        return rows Deleted;
    }

    public void setRows Deleted(Short rows Deleted) {
        this.rows Deleted = rows Deleted;
    }

    public Short getBytes Freed() {
        return bytes Freed;
    }

    public void setBytes Freed(Short bytes Freed) {
        this.bytes Freed = bytes Freed;
    }

    public Integer getCI Table Id() {
        return CI Table Id;
    }

    public void setCI Table Id(Integer CI Table Id) {
        this.CI Table Id = CI Table Id;
    }

    public Short getCI Index Id() {
        return CI Index Id;
    }

    public void setCI Index Id(Short CI Index Id) {
        this.CI Index Id = CI Index Id;
    }

    public Long getNewAllocUnitId() {
        return newAllocUnitId;
    }

    public void setNewAllocUnitId(Long newAllocUnitId) {
        this.newAllocUnitId = newAllocUnitId;
    }

    public Short getFileGroup ID() {
        return fileGroup ID;
    }

    public void setFileGroup ID(Short fileGroup ID) {
        this.fileGroup ID = fileGroup ID;
    }

    public Short getFile ID() {
        return file ID;
    }

    public void setFile ID(Short file ID) {
        this.file ID = file ID;
    }

    public String getPhysical Name() {
        return physical Name;
    }

    public void setPhysical Name(String physical Name) {
        this.physical Name = physical Name == null ? null : physical Name.trim();
    }

    public String getLogical Name() {
        return logical Name;
    }

    public void setLogical Name(String logical Name) {
        this.logical Name = logical Name == null ? null : logical Name.trim();
    }

    public String getFormat LSN() {
        return format LSN;
    }

    public void setFormat LSN(String format LSN) {
        this.format LSN = format LSN == null ? null : format LSN.trim();
    }

    public Long getRowsetId() {
        return rowsetId;
    }

    public void setRowsetId(Long rowsetId) {
        this.rowsetId = rowsetId;
    }

    public Integer getColumn Offset() {
        return column Offset;
    }

    public void setColumn Offset(Integer column Offset) {
        this.column Offset = column Offset;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Long getText Size() {
        return text Size;
    }

    public void setText Size(Long text Size) {
        this.text Size = text Size;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOld Size() {
        return old Size;
    }

    public void setOld Size(Long old Size) {
        this.old Size = old Size;
    }

    public Long getNew Size() {
        return new Size;
    }

    public void setNew Size(Long new Size) {
        this.new Size = new Size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getBulk allocated extent count() {
        return bulk allocated extent count;
    }

    public void setBulk allocated extent count(Integer bulk allocated extent count) {
        this.bulk allocated extent count = bulk allocated extent count;
    }

    public Long getBulk RowsetId() {
        return bulk RowsetId;
    }

    public void setBulk RowsetId(Long bulk RowsetId) {
        this.bulk RowsetId = bulk RowsetId;
    }

    public Long getBulk AllocUnitId() {
        return bulk AllocUnitId;
    }

    public void setBulk AllocUnitId(Long bulk AllocUnitId) {
        this.bulk AllocUnitId = bulk AllocUnitId;
    }

    public String getBulk allocation first IAM Page ID() {
        return bulk allocation first IAM Page ID;
    }

    public void setBulk allocation first IAM Page ID(String bulk allocation first IAM Page ID) {
        this.bulk allocation first IAM Page ID = bulk allocation first IAM Page ID == null ? null : bulk allocation first IAM Page ID.trim();
    }

    public String getBulk allocated extent ids() {
        return bulk allocated extent ids;
    }

    public void setBulk allocated extent ids(String bulk allocated extent ids) {
        this.bulk allocated extent ids = bulk allocated extent ids == null ? null : bulk allocated extent ids.trim();
    }

    public Short getCompression Log Type() {
        return compression Log Type;
    }

    public void setCompression Log Type(Short compression Log Type) {
        this.compression Log Type = compression Log Type;
    }

    public Short getPageFormat PageType() {
        return pageFormat PageType;
    }

    public void setPageFormat PageType(Short pageFormat PageType) {
        this.pageFormat PageType = pageFormat PageType;
    }

    public Short getPageFormat PageFlags() {
        return pageFormat PageFlags;
    }

    public void setPageFormat PageFlags(Short pageFormat PageFlags) {
        this.pageFormat PageFlags = pageFormat PageFlags;
    }

    public Short getPageFormat PageLevel() {
        return pageFormat PageLevel;
    }

    public void setPageFormat PageLevel(Short pageFormat PageLevel) {
        this.pageFormat PageLevel = pageFormat PageLevel;
    }

    public Short getPageFormat PageStat() {
        return pageFormat PageStat;
    }

    public void setPageFormat PageStat(Short pageFormat PageStat) {
        this.pageFormat PageStat = pageFormat PageStat;
    }

    public Short getPageFormat FormatOption() {
        return pageFormat FormatOption;
    }

    public void setPageFormat FormatOption(Short pageFormat FormatOption) {
        this.pageFormat FormatOption = pageFormat FormatOption;
    }
}