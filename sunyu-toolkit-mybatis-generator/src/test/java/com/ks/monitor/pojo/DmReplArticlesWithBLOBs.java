package com.ks.monitor.pojo;

public class DmReplArticlesWithBLOBs extends DmReplArticles {
    private byte[] artcache_db_address;

    private byte[] artcache_table_address;

    private byte[] artcache_schema_address;

    private byte[] artcache_article_address;

    public byte[] getArtcache_db_address() {
        return artcache_db_address;
    }

    public void setArtcache_db_address(byte[] artcache_db_address) {
        this.artcache_db_address = artcache_db_address;
    }

    public byte[] getArtcache_table_address() {
        return artcache_table_address;
    }

    public void setArtcache_table_address(byte[] artcache_table_address) {
        this.artcache_table_address = artcache_table_address;
    }

    public byte[] getArtcache_schema_address() {
        return artcache_schema_address;
    }

    public void setArtcache_schema_address(byte[] artcache_schema_address) {
        this.artcache_schema_address = artcache_schema_address;
    }

    public byte[] getArtcache_article_address() {
        return artcache_article_address;
    }

    public void setArtcache_article_address(byte[] artcache_article_address) {
        this.artcache_article_address = artcache_article_address;
    }
}