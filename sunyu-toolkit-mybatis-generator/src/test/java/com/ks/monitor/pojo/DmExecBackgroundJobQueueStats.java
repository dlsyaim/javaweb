package com.ks.monitor.pojo;

public class DmExecBackgroundJobQueueStats {
    private Integer queue_max_len;

    private Integer enqueued_count;

    private Integer started_count;

    private Integer ended_count;

    private Integer failed_lock_count;

    private Integer failed_other_count;

    private Integer failed_giveup_count;

    private Integer enqueue_failed_full_count;

    private Integer enqueue_failed_duplicate_count;

    private Integer elapsed_avg_ms;

    private Integer elapsed_max_ms;

    public Integer getQueue_max_len() {
        return queue_max_len;
    }

    public void setQueue_max_len(Integer queue_max_len) {
        this.queue_max_len = queue_max_len;
    }

    public Integer getEnqueued_count() {
        return enqueued_count;
    }

    public void setEnqueued_count(Integer enqueued_count) {
        this.enqueued_count = enqueued_count;
    }

    public Integer getStarted_count() {
        return started_count;
    }

    public void setStarted_count(Integer started_count) {
        this.started_count = started_count;
    }

    public Integer getEnded_count() {
        return ended_count;
    }

    public void setEnded_count(Integer ended_count) {
        this.ended_count = ended_count;
    }

    public Integer getFailed_lock_count() {
        return failed_lock_count;
    }

    public void setFailed_lock_count(Integer failed_lock_count) {
        this.failed_lock_count = failed_lock_count;
    }

    public Integer getFailed_other_count() {
        return failed_other_count;
    }

    public void setFailed_other_count(Integer failed_other_count) {
        this.failed_other_count = failed_other_count;
    }

    public Integer getFailed_giveup_count() {
        return failed_giveup_count;
    }

    public void setFailed_giveup_count(Integer failed_giveup_count) {
        this.failed_giveup_count = failed_giveup_count;
    }

    public Integer getEnqueue_failed_full_count() {
        return enqueue_failed_full_count;
    }

    public void setEnqueue_failed_full_count(Integer enqueue_failed_full_count) {
        this.enqueue_failed_full_count = enqueue_failed_full_count;
    }

    public Integer getEnqueue_failed_duplicate_count() {
        return enqueue_failed_duplicate_count;
    }

    public void setEnqueue_failed_duplicate_count(Integer enqueue_failed_duplicate_count) {
        this.enqueue_failed_duplicate_count = enqueue_failed_duplicate_count;
    }

    public Integer getElapsed_avg_ms() {
        return elapsed_avg_ms;
    }

    public void setElapsed_avg_ms(Integer elapsed_avg_ms) {
        this.elapsed_avg_ms = elapsed_avg_ms;
    }

    public Integer getElapsed_max_ms() {
        return elapsed_max_ms;
    }

    public void setElapsed_max_ms(Integer elapsed_max_ms) {
        this.elapsed_max_ms = elapsed_max_ms;
    }
}