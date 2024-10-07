package com.example.application.views.applayoutheightauto;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.List;

@PageTitle("App Layout Height Auto")
@Route(value = "app-layout-height-auto", layout = MainLayout.class)
public class AppLayoutHeightAutoView extends AppLayout {

    public AppLayoutHeightAutoView() {
        H1 title = new H1("MyApp");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "var(--lumo-space-m)");
        addToNavbar(title);

        Grid<Person> grid = new Grid<>(Person.class, false);
        grid.addColumn(Person::getFirstName).setHeader("First name");
        grid.addColumn(Person::getLastName).setHeader("Last name");

        List<Person> people = DataService.getPeople(20);
        grid.setItems(people);
        grid.setAllRowsVisible(true);
        setContent(grid);
    }

}
