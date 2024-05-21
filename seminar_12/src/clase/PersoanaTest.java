package clase;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnF() {
        Persoana persoana = new Persoana("Elena", "6001485174957");
        assertEquals(persoana.getSex(), "F");

    }

    @org.junit.Test
    public void getSexReturnM() {

        Persoana persoana_1 = new Persoana("Andrei", "5001485174957");
        assertEquals(persoana_1.getSex(), "M");
    }

    @org.junit.Test
    public void getSexCrossCheck() {
        String cnp = "5001485174957";
        Persoana persoana = new Persoana("Mihai", cnp);
        String sex;
        if(Integer.valueOf(cnp.charAt(0)) %2 == 0){
            sex = String.valueOf("F");
        } else {
            sex = String.valueOf("M");
        }

        assertEquals(persoana.getSex(), sex);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCNPStartWithNumberOutsideCase() {

        Persoana persoana = new Persoana("Andrei", "9001485174957");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCNPStartWithInvalidCharacter() {

        Persoana persoana = new Persoana("Andrei", "-001485174957");
        persoana.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorCNPisEmptyString() {

        Persoana persoana = new Persoana("Andrei", "");
        persoana.getSex();
    }

    @org.junit.Test()
    public void getSexCorrect() {
        Persoana persoana = new Persoana("Andrei", "3001485174957");
        assertEquals( 1, persoana.getSex().length());
    }

    @org.junit.Test()
    public void getSexCorrectByLetterM() {
        Persoana persoana = new Persoana("Andrei", "3001485174957");
        boolean isCorrect = persoana.getSex().equals("M")||persoana.getSex().equals("F");
        assertTrue(isCorrect);
    }

    @org.junit.Test()
    public void getSexOrder() {
        Persoana persoana = new Persoana("Andrei", "3001485174957");
        Persoana persoana_1 = new Persoana("Elena", "4001485174957");
        assertTrue(persoana.getSex().compareTo(persoana_1.getSex()) > 0);
    }

    @org.junit.Test()
    public void getSexRange() {
        Persoana persoana = new Persoana("Elena", "8001485174957");
        assertEquals(persoana.getSex(), "F");

    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistance() {
        Persoana persoana = new Persoana("Elena", null);
        persoana.getSex();

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexCardinallity() {
        Persoana persoana = new Persoana("Elena", "0000000000000");
        persoana.getSex();

    }
}