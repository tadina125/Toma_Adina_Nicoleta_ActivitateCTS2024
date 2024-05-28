package test;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.experimental.categories.Category;
import test.categori.WithMock;
import test.categori.WithoutMock;
import test.dubluri.PersoanaFake;
import org.junit.Test;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(WithoutMock.class)
    public void testeazaCorectitudineAplicaDiscount(){
        IPersoana client = new Persoana("Andrei", "1260303618492");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Destinatie_1", 22.5);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(18.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(WithoutMock.class)
    public void aplicaDiscountBoundary(){
        IPersoana client = new Persoana("Dan", "159020765194");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 33.5);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30.15, pachetTuristic.getPret(), 0.01);

    }

    @Test
    @Category(WithMock.class)
    public void aplicaDiscountGetVarstaFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Oradea", 30.0);
        client.setValoareGetVarsta(70);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(27, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(WithMock.class)
    public void nuAplicaDiscountGetVarstaFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Oradea", 30.0);
        client.setValoareGetVarsta(25);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(30, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(WithMock.class)
    public void aplicareDiscountMaximBoundaryFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Venetia", 100.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(WithMock.class)
    public void neaplicareDiscountBoundaryFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Venetia", 100.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(100.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(WithMock.class)
    public void aplicareDiscountMinimBoundaryFake(){
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Venetia", 100.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(1);
        assertEquals(99.0, pachetTuristic.getPret(), 0.01);
    }

}