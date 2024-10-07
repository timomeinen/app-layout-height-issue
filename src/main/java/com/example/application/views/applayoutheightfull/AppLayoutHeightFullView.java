package com.example.application.views.applayoutheightfull;

import com.example.application.views.MainLayout;
import com.example.application.views.applayoutheightauto.DataService;
import com.example.application.views.applayoutheightauto.Person;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

import java.util.List;

@PageTitle("App Layout Height Full")
@Route(value = "app-layout-height-full", layout = MainLayout.class)
public class AppLayoutHeightFullView extends AppLayout {

    public AppLayoutHeightFullView() {
        H1 title = new H1("MyApp");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "var(--lumo-space-m)");
        addToNavbar(title);

        Grid<Person> grid = new Grid<>(Person.class, false);
        grid.addColumn(Person::getFirstName).setHeader("First name");
        grid.addColumn(Person::getLastName).setHeader("Last name");

        List<Person> people = DataService.getPeople(20);
        grid.setItems(people);
        setContent(grid);

        getElement().getStyle().set("height", "100%");
        grid.setHeight("100%");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER);
    }

}