package tacho;


public class Tacho_test {
    Tacho tacho_graf;

    @Test
    public void teszt()
    {
        tacho_graf.put(03-06-2022, 2, 3);
        tacho_graf.put(03-06-2021, 1, 4);
        tacho_graf.put(03-06-2020, 0, 5);
        Asser.assertEquals(3, tacho_graf.rowKeySet());
    }

}
