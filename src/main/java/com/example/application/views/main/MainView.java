package com.example.application.views.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Halo |screen")
@Route(value = "")
@CssImport("./Halo/halostyles.css")


public class MainView extends HorizontalLayout {

    private final InputFeatures inputFeatures=new InputFeatures();

    public MainView() {


        add(getHeader());
    }

    public Div getHeader() {

        Tab dataBank = new Tab(VaadinIcon.ALIGN_CENTER.create(),
                new Span("Data Bank"));
        dataBank.getElement().getStyle().set("color","yellow");
        Tab features = new Tab(VaadinIcon.COGS.create(),
                new Span("features"));
        features.getElement().getStyle().set("color","white");
        Tab model = new Tab(VaadinIcon. CUBES.create(),
                new Span("Model"));
        model.getElement().getStyle().set("color","white");
        Tab result = new Tab(VaadinIcon.LINE_CHART.create(),
                new Span("Result"));
        result.getElement().getStyle().set("color","white");
        Tab api = new Tab(VaadinIcon.UPLOAD.create(),new Span("API"));
        api.getElement().getStyle().set("color","white");


        Tabs header = new Tabs(dataBank, features, model, result, api);

        var title=new H2("HALOBOX");
        title.addClassName("halo-box");

        title.getElement().getStyle().set("color","white");
        Div head=new Div(new HorizontalLayout(title,header));
        head.addClassName("head-style");

        Tab dashboard = new Tab("Dashboard");
        Tab Metadata = new Tab("Metadata");
        Tab Data = new Tab("Data");
        Tab Pipeline = new Tab("Pipeline");

        Tabs subheader=new Tabs(dashboard,Metadata,Data,Pipeline);
        subheader.addThemeVariants(TabsVariant.LUMO_CENTERED);
        subheader.setHeight("50px");
        subheader.setWidth("1500px");


        Div sub=new Div();
        sub.addClassName("sub-sub");
        sub.add(subheader);

        Div divHeader=new Div(new VerticalLayout(head,subheader,inputFeatures.getTabsCheckbox()));

        divHeader.addClassName("div-header");
        divHeader.setSizeFull();

        return divHeader;


    }


}