package com.company.test1.web.screens.store;

import com.haulmont.cuba.gui.screen.*;
import com.company.test1.entity.Store;

@UiController("test1_Store.edit")
@UiDescriptor("store-edit.xml")
@EditedEntityContainer("storeDc")
@LoadDataBeforeShow
public class StoreEdit extends StandardEditor<Store> {
}