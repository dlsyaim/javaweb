package com.ks.monitor.pojo;

public class DmReplSchemas {
    private Integer tabid;

    private Short indexid;

    private Integer idSch;

    private String tabschema;

    private Short ccTabschema;

    private String tabname;

    private Short ccTabname;

    private Long rowsetid_delete;

    private Long rowsetid_insert;

    private Integer num_pk_cols;

    private Integer re_numtextcols;

    private String re_schema_lsn_begin;

    private String re_schema_lsn_end;

    private Integer re_numcols;

    private Integer re_colid;

    private String re_awcName;

    private Short re_ccName;

    private Short re_colattr;

    private Short re_maxlen;

    private Byte re_prec;

    private Byte re_scale;

    private Integer re_collatid;

    private Byte re_xvtype;

    private Integer re_offset;

    private Byte re_bitpos;

    private Byte re_fNullable;

    private Byte re_fAnsiTrim;

    private Integer re_computed;

    private Long se_rowsetid;

    private String se_schema_lsn_begin;

    private String se_schema_lsn_end;

    private Integer se_numcols;

    private Integer se_colid;

    private Short se_maxlen;

    private Byte se_prec;

    private Byte se_scale;

    private Integer se_collatid;

    private Byte se_xvtype;

    private Integer se_offset;

    private Byte se_bitpos;

    private Byte se_fNullable;

    private Byte se_fAnsiTrim;

    private Byte se_computed;

    private Short se_nullBitInLeafRows;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Short getIndexid() {
        return indexid;
    }

    public void setIndexid(Short indexid) {
        this.indexid = indexid;
    }

    public Integer getIdSch() {
        return idSch;
    }

    public void setIdSch(Integer idSch) {
        this.idSch = idSch;
    }

    public String getTabschema() {
        return tabschema;
    }

    public void setTabschema(String tabschema) {
        this.tabschema = tabschema == null ? null : tabschema.trim();
    }

    public Short getCcTabschema() {
        return ccTabschema;
    }

    public void setCcTabschema(Short ccTabschema) {
        this.ccTabschema = ccTabschema;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname == null ? null : tabname.trim();
    }

    public Short getCcTabname() {
        return ccTabname;
    }

    public void setCcTabname(Short ccTabname) {
        this.ccTabname = ccTabname;
    }

    public Long getRowsetid_delete() {
        return rowsetid_delete;
    }

    public void setRowsetid_delete(Long rowsetid_delete) {
        this.rowsetid_delete = rowsetid_delete;
    }

    public Long getRowsetid_insert() {
        return rowsetid_insert;
    }

    public void setRowsetid_insert(Long rowsetid_insert) {
        this.rowsetid_insert = rowsetid_insert;
    }

    public Integer getNum_pk_cols() {
        return num_pk_cols;
    }

    public void setNum_pk_cols(Integer num_pk_cols) {
        this.num_pk_cols = num_pk_cols;
    }

    public Integer getRe_numtextcols() {
        return re_numtextcols;
    }

    public void setRe_numtextcols(Integer re_numtextcols) {
        this.re_numtextcols = re_numtextcols;
    }

    public String getRe_schema_lsn_begin() {
        return re_schema_lsn_begin;
    }

    public void setRe_schema_lsn_begin(String re_schema_lsn_begin) {
        this.re_schema_lsn_begin = re_schema_lsn_begin == null ? null : re_schema_lsn_begin.trim();
    }

    public String getRe_schema_lsn_end() {
        return re_schema_lsn_end;
    }

    public void setRe_schema_lsn_end(String re_schema_lsn_end) {
        this.re_schema_lsn_end = re_schema_lsn_end == null ? null : re_schema_lsn_end.trim();
    }

    public Integer getRe_numcols() {
        return re_numcols;
    }

    public void setRe_numcols(Integer re_numcols) {
        this.re_numcols = re_numcols;
    }

    public Integer getRe_colid() {
        return re_colid;
    }

    public void setRe_colid(Integer re_colid) {
        this.re_colid = re_colid;
    }

    public String getRe_awcName() {
        return re_awcName;
    }

    public void setRe_awcName(String re_awcName) {
        this.re_awcName = re_awcName == null ? null : re_awcName.trim();
    }

    public Short getRe_ccName() {
        return re_ccName;
    }

    public void setRe_ccName(Short re_ccName) {
        this.re_ccName = re_ccName;
    }

    public Short getRe_colattr() {
        return re_colattr;
    }

    public void setRe_colattr(Short re_colattr) {
        this.re_colattr = re_colattr;
    }

    public Short getRe_maxlen() {
        return re_maxlen;
    }

    public void setRe_maxlen(Short re_maxlen) {
        this.re_maxlen = re_maxlen;
    }

    public Byte getRe_prec() {
        return re_prec;
    }

    public void setRe_prec(Byte re_prec) {
        this.re_prec = re_prec;
    }

    public Byte getRe_scale() {
        return re_scale;
    }

    public void setRe_scale(Byte re_scale) {
        this.re_scale = re_scale;
    }

    public Integer getRe_collatid() {
        return re_collatid;
    }

    public void setRe_collatid(Integer re_collatid) {
        this.re_collatid = re_collatid;
    }

    public Byte getRe_xvtype() {
        return re_xvtype;
    }

    public void setRe_xvtype(Byte re_xvtype) {
        this.re_xvtype = re_xvtype;
    }

    public Integer getRe_offset() {
        return re_offset;
    }

    public void setRe_offset(Integer re_offset) {
        this.re_offset = re_offset;
    }

    public Byte getRe_bitpos() {
        return re_bitpos;
    }

    public void setRe_bitpos(Byte re_bitpos) {
        this.re_bitpos = re_bitpos;
    }

    public Byte getRe_fNullable() {
        return re_fNullable;
    }

    public void setRe_fNullable(Byte re_fNullable) {
        this.re_fNullable = re_fNullable;
    }

    public Byte getRe_fAnsiTrim() {
        return re_fAnsiTrim;
    }

    public void setRe_fAnsiTrim(Byte re_fAnsiTrim) {
        this.re_fAnsiTrim = re_fAnsiTrim;
    }

    public Integer getRe_computed() {
        return re_computed;
    }

    public void setRe_computed(Integer re_computed) {
        this.re_computed = re_computed;
    }

    public Long getSe_rowsetid() {
        return se_rowsetid;
    }

    public void setSe_rowsetid(Long se_rowsetid) {
        this.se_rowsetid = se_rowsetid;
    }

    public String getSe_schema_lsn_begin() {
        return se_schema_lsn_begin;
    }

    public void setSe_schema_lsn_begin(String se_schema_lsn_begin) {
        this.se_schema_lsn_begin = se_schema_lsn_begin == null ? null : se_schema_lsn_begin.trim();
    }

    public String getSe_schema_lsn_end() {
        return se_schema_lsn_end;
    }

    public void setSe_schema_lsn_end(String se_schema_lsn_end) {
        this.se_schema_lsn_end = se_schema_lsn_end == null ? null : se_schema_lsn_end.trim();
    }

    public Integer getSe_numcols() {
        return se_numcols;
    }

    public void setSe_numcols(Integer se_numcols) {
        this.se_numcols = se_numcols;
    }

    public Integer getSe_colid() {
        return se_colid;
    }

    public void setSe_colid(Integer se_colid) {
        this.se_colid = se_colid;
    }

    public Short getSe_maxlen() {
        return se_maxlen;
    }

    public void setSe_maxlen(Short se_maxlen) {
        this.se_maxlen = se_maxlen;
    }

    public Byte getSe_prec() {
        return se_prec;
    }

    public void setSe_prec(Byte se_prec) {
        this.se_prec = se_prec;
    }

    public Byte getSe_scale() {
        return se_scale;
    }

    public void setSe_scale(Byte se_scale) {
        this.se_scale = se_scale;
    }

    public Integer getSe_collatid() {
        return se_collatid;
    }

    public void setSe_collatid(Integer se_collatid) {
        this.se_collatid = se_collatid;
    }

    public Byte getSe_xvtype() {
        return se_xvtype;
    }

    public void setSe_xvtype(Byte se_xvtype) {
        this.se_xvtype = se_xvtype;
    }

    public Integer getSe_offset() {
        return se_offset;
    }

    public void setSe_offset(Integer se_offset) {
        this.se_offset = se_offset;
    }

    public Byte getSe_bitpos() {
        return se_bitpos;
    }

    public void setSe_bitpos(Byte se_bitpos) {
        this.se_bitpos = se_bitpos;
    }

    public Byte getSe_fNullable() {
        return se_fNullable;
    }

    public void setSe_fNullable(Byte se_fNullable) {
        this.se_fNullable = se_fNullable;
    }

    public Byte getSe_fAnsiTrim() {
        return se_fAnsiTrim;
    }

    public void setSe_fAnsiTrim(Byte se_fAnsiTrim) {
        this.se_fAnsiTrim = se_fAnsiTrim;
    }

    public Byte getSe_computed() {
        return se_computed;
    }

    public void setSe_computed(Byte se_computed) {
        this.se_computed = se_computed;
    }

    public Short getSe_nullBitInLeafRows() {
        return se_nullBitInLeafRows;
    }

    public void setSe_nullBitInLeafRows(Short se_nullBitInLeafRows) {
        this.se_nullBitInLeafRows = se_nullBitInLeafRows;
    }
}