package com.ks.monitor.pojo;

public class DmDbIndexOperationalStats {
    private Short database_id;

    private Integer object_id;

    private Integer index_id;

    private Integer partition_number;

    private Long leaf_insert_count;

    private Long leaf_delete_count;

    private Long leaf_update_count;

    private Long leaf_ghost_count;

    private Long nonleaf_insert_count;

    private Long nonleaf_delete_count;

    private Long nonleaf_update_count;

    private Long leaf_allocation_count;

    private Long nonleaf_allocation_count;

    private Long leaf_page_merge_count;

    private Long nonleaf_page_merge_count;

    private Long range_scan_count;

    private Long singleton_lookup_count;

    private Long forwarded_fetch_count;

    private Long lob_fetch_in_pages;

    private Long lob_fetch_in_bytes;

    private Long lob_orphan_create_count;

    private Long lob_orphan_insert_count;

    private Long row_overflow_fetch_in_pages;

    private Long row_overflow_fetch_in_bytes;

    private Long column_value_push_off_row_count;

    private Long column_value_pull_in_row_count;

    private Long row_lock_count;

    private Long row_lock_wait_count;

    private Long row_lock_wait_in_ms;

    private Long page_lock_count;

    private Long page_lock_wait_count;

    private Long page_lock_wait_in_ms;

    private Long index_lock_promotion_attempt_count;

    private Long index_lock_promotion_count;

    private Long page_latch_wait_count;

    private Long page_latch_wait_in_ms;

    private Long page_io_latch_wait_count;

    private Long page_io_latch_wait_in_ms;

    private Long tree_page_latch_wait_count;

    private Long tree_page_latch_wait_in_ms;

    private Long tree_page_io_latch_wait_count;

    private Long tree_page_io_latch_wait_in_ms;

    private Long page_compression_attempt_count;

    private Long page_compression_success_count;

    public Short getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(Short database_id) {
        this.database_id = database_id;
    }

    public Integer getObject_id() {
        return object_id;
    }

    public void setObject_id(Integer object_id) {
        this.object_id = object_id;
    }

    public Integer getIndex_id() {
        return index_id;
    }

    public void setIndex_id(Integer index_id) {
        this.index_id = index_id;
    }

    public Integer getPartition_number() {
        return partition_number;
    }

    public void setPartition_number(Integer partition_number) {
        this.partition_number = partition_number;
    }

    public Long getLeaf_insert_count() {
        return leaf_insert_count;
    }

    public void setLeaf_insert_count(Long leaf_insert_count) {
        this.leaf_insert_count = leaf_insert_count;
    }

    public Long getLeaf_delete_count() {
        return leaf_delete_count;
    }

    public void setLeaf_delete_count(Long leaf_delete_count) {
        this.leaf_delete_count = leaf_delete_count;
    }

    public Long getLeaf_update_count() {
        return leaf_update_count;
    }

    public void setLeaf_update_count(Long leaf_update_count) {
        this.leaf_update_count = leaf_update_count;
    }

    public Long getLeaf_ghost_count() {
        return leaf_ghost_count;
    }

    public void setLeaf_ghost_count(Long leaf_ghost_count) {
        this.leaf_ghost_count = leaf_ghost_count;
    }

    public Long getNonleaf_insert_count() {
        return nonleaf_insert_count;
    }

    public void setNonleaf_insert_count(Long nonleaf_insert_count) {
        this.nonleaf_insert_count = nonleaf_insert_count;
    }

    public Long getNonleaf_delete_count() {
        return nonleaf_delete_count;
    }

    public void setNonleaf_delete_count(Long nonleaf_delete_count) {
        this.nonleaf_delete_count = nonleaf_delete_count;
    }

    public Long getNonleaf_update_count() {
        return nonleaf_update_count;
    }

    public void setNonleaf_update_count(Long nonleaf_update_count) {
        this.nonleaf_update_count = nonleaf_update_count;
    }

    public Long getLeaf_allocation_count() {
        return leaf_allocation_count;
    }

    public void setLeaf_allocation_count(Long leaf_allocation_count) {
        this.leaf_allocation_count = leaf_allocation_count;
    }

    public Long getNonleaf_allocation_count() {
        return nonleaf_allocation_count;
    }

    public void setNonleaf_allocation_count(Long nonleaf_allocation_count) {
        this.nonleaf_allocation_count = nonleaf_allocation_count;
    }

    public Long getLeaf_page_merge_count() {
        return leaf_page_merge_count;
    }

    public void setLeaf_page_merge_count(Long leaf_page_merge_count) {
        this.leaf_page_merge_count = leaf_page_merge_count;
    }

    public Long getNonleaf_page_merge_count() {
        return nonleaf_page_merge_count;
    }

    public void setNonleaf_page_merge_count(Long nonleaf_page_merge_count) {
        this.nonleaf_page_merge_count = nonleaf_page_merge_count;
    }

    public Long getRange_scan_count() {
        return range_scan_count;
    }

    public void setRange_scan_count(Long range_scan_count) {
        this.range_scan_count = range_scan_count;
    }

    public Long getSingleton_lookup_count() {
        return singleton_lookup_count;
    }

    public void setSingleton_lookup_count(Long singleton_lookup_count) {
        this.singleton_lookup_count = singleton_lookup_count;
    }

    public Long getForwarded_fetch_count() {
        return forwarded_fetch_count;
    }

    public void setForwarded_fetch_count(Long forwarded_fetch_count) {
        this.forwarded_fetch_count = forwarded_fetch_count;
    }

    public Long getLob_fetch_in_pages() {
        return lob_fetch_in_pages;
    }

    public void setLob_fetch_in_pages(Long lob_fetch_in_pages) {
        this.lob_fetch_in_pages = lob_fetch_in_pages;
    }

    public Long getLob_fetch_in_bytes() {
        return lob_fetch_in_bytes;
    }

    public void setLob_fetch_in_bytes(Long lob_fetch_in_bytes) {
        this.lob_fetch_in_bytes = lob_fetch_in_bytes;
    }

    public Long getLob_orphan_create_count() {
        return lob_orphan_create_count;
    }

    public void setLob_orphan_create_count(Long lob_orphan_create_count) {
        this.lob_orphan_create_count = lob_orphan_create_count;
    }

    public Long getLob_orphan_insert_count() {
        return lob_orphan_insert_count;
    }

    public void setLob_orphan_insert_count(Long lob_orphan_insert_count) {
        this.lob_orphan_insert_count = lob_orphan_insert_count;
    }

    public Long getRow_overflow_fetch_in_pages() {
        return row_overflow_fetch_in_pages;
    }

    public void setRow_overflow_fetch_in_pages(Long row_overflow_fetch_in_pages) {
        this.row_overflow_fetch_in_pages = row_overflow_fetch_in_pages;
    }

    public Long getRow_overflow_fetch_in_bytes() {
        return row_overflow_fetch_in_bytes;
    }

    public void setRow_overflow_fetch_in_bytes(Long row_overflow_fetch_in_bytes) {
        this.row_overflow_fetch_in_bytes = row_overflow_fetch_in_bytes;
    }

    public Long getColumn_value_push_off_row_count() {
        return column_value_push_off_row_count;
    }

    public void setColumn_value_push_off_row_count(Long column_value_push_off_row_count) {
        this.column_value_push_off_row_count = column_value_push_off_row_count;
    }

    public Long getColumn_value_pull_in_row_count() {
        return column_value_pull_in_row_count;
    }

    public void setColumn_value_pull_in_row_count(Long column_value_pull_in_row_count) {
        this.column_value_pull_in_row_count = column_value_pull_in_row_count;
    }

    public Long getRow_lock_count() {
        return row_lock_count;
    }

    public void setRow_lock_count(Long row_lock_count) {
        this.row_lock_count = row_lock_count;
    }

    public Long getRow_lock_wait_count() {
        return row_lock_wait_count;
    }

    public void setRow_lock_wait_count(Long row_lock_wait_count) {
        this.row_lock_wait_count = row_lock_wait_count;
    }

    public Long getRow_lock_wait_in_ms() {
        return row_lock_wait_in_ms;
    }

    public void setRow_lock_wait_in_ms(Long row_lock_wait_in_ms) {
        this.row_lock_wait_in_ms = row_lock_wait_in_ms;
    }

    public Long getPage_lock_count() {
        return page_lock_count;
    }

    public void setPage_lock_count(Long page_lock_count) {
        this.page_lock_count = page_lock_count;
    }

    public Long getPage_lock_wait_count() {
        return page_lock_wait_count;
    }

    public void setPage_lock_wait_count(Long page_lock_wait_count) {
        this.page_lock_wait_count = page_lock_wait_count;
    }

    public Long getPage_lock_wait_in_ms() {
        return page_lock_wait_in_ms;
    }

    public void setPage_lock_wait_in_ms(Long page_lock_wait_in_ms) {
        this.page_lock_wait_in_ms = page_lock_wait_in_ms;
    }

    public Long getIndex_lock_promotion_attempt_count() {
        return index_lock_promotion_attempt_count;
    }

    public void setIndex_lock_promotion_attempt_count(Long index_lock_promotion_attempt_count) {
        this.index_lock_promotion_attempt_count = index_lock_promotion_attempt_count;
    }

    public Long getIndex_lock_promotion_count() {
        return index_lock_promotion_count;
    }

    public void setIndex_lock_promotion_count(Long index_lock_promotion_count) {
        this.index_lock_promotion_count = index_lock_promotion_count;
    }

    public Long getPage_latch_wait_count() {
        return page_latch_wait_count;
    }

    public void setPage_latch_wait_count(Long page_latch_wait_count) {
        this.page_latch_wait_count = page_latch_wait_count;
    }

    public Long getPage_latch_wait_in_ms() {
        return page_latch_wait_in_ms;
    }

    public void setPage_latch_wait_in_ms(Long page_latch_wait_in_ms) {
        this.page_latch_wait_in_ms = page_latch_wait_in_ms;
    }

    public Long getPage_io_latch_wait_count() {
        return page_io_latch_wait_count;
    }

    public void setPage_io_latch_wait_count(Long page_io_latch_wait_count) {
        this.page_io_latch_wait_count = page_io_latch_wait_count;
    }

    public Long getPage_io_latch_wait_in_ms() {
        return page_io_latch_wait_in_ms;
    }

    public void setPage_io_latch_wait_in_ms(Long page_io_latch_wait_in_ms) {
        this.page_io_latch_wait_in_ms = page_io_latch_wait_in_ms;
    }

    public Long getTree_page_latch_wait_count() {
        return tree_page_latch_wait_count;
    }

    public void setTree_page_latch_wait_count(Long tree_page_latch_wait_count) {
        this.tree_page_latch_wait_count = tree_page_latch_wait_count;
    }

    public Long getTree_page_latch_wait_in_ms() {
        return tree_page_latch_wait_in_ms;
    }

    public void setTree_page_latch_wait_in_ms(Long tree_page_latch_wait_in_ms) {
        this.tree_page_latch_wait_in_ms = tree_page_latch_wait_in_ms;
    }

    public Long getTree_page_io_latch_wait_count() {
        return tree_page_io_latch_wait_count;
    }

    public void setTree_page_io_latch_wait_count(Long tree_page_io_latch_wait_count) {
        this.tree_page_io_latch_wait_count = tree_page_io_latch_wait_count;
    }

    public Long getTree_page_io_latch_wait_in_ms() {
        return tree_page_io_latch_wait_in_ms;
    }

    public void setTree_page_io_latch_wait_in_ms(Long tree_page_io_latch_wait_in_ms) {
        this.tree_page_io_latch_wait_in_ms = tree_page_io_latch_wait_in_ms;
    }

    public Long getPage_compression_attempt_count() {
        return page_compression_attempt_count;
    }

    public void setPage_compression_attempt_count(Long page_compression_attempt_count) {
        this.page_compression_attempt_count = page_compression_attempt_count;
    }

    public Long getPage_compression_success_count() {
        return page_compression_success_count;
    }

    public void setPage_compression_success_count(Long page_compression_success_count) {
        this.page_compression_success_count = page_compression_success_count;
    }
}