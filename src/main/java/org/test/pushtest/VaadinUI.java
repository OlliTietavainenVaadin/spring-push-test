package org.test.pushtest;

import com.vaadin.annotations.Push;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class VaadinUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setSizeFull();

        HorizontalLayout layout = new HorizontalLayout();
        layout.setSizeFull();
        layout.addComponent(new Label("VaadinUI"));


        setContent(layout);
    }
}
