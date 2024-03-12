alter table TEST1_ITEM add constraint FK_TEST1_ITEM_ON_STORE foreign key (STORE_ID) references TEST1_STORE(ID);
create unique index IDX_TEST1_ITEM_UK_ID_ITEM on TEST1_ITEM (ID_ITEM) where DELETE_TS is null ;
create unique index IDX_TEST1_ITEM_UK_NAME on TEST1_ITEM (NAME) where DELETE_TS is null ;
create index IDX_TEST1_ITEM_ON_STORE on TEST1_ITEM (STORE_ID);
