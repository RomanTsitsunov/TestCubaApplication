-- begin TEST1_ITEM
create table TEST1_ITEM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_ITEM uuid not null,
    STORE_ID uuid not null,
    NAME varchar(255) not null,
    COUNT_ integer not null,
    --
    primary key (ID)
)^
-- end TEST1_ITEM
-- begin TEST1_STORE
create table TEST1_STORE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_STORE uuid not null,
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end TEST1_STORE
