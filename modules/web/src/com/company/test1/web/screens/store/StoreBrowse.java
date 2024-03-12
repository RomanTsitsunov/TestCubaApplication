package com.company.test1.web.screens.store;

import com.haulmont.cuba.gui.screen.*;
import com.company.test1.entity.Store;

@UiController("test1_Store.browse")
@UiDescriptor("store-browse.xml")
@LookupComponent("storesTable")
@LoadDataBeforeShow
public class StoreBrowse extends StandardLookup<Store> {
}