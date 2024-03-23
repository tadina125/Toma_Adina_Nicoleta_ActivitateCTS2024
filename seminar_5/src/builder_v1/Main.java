package builder_v1;

public class Main {
    public static void main(String[] args) {

        FacilitatiInternare facilitatiInternare = new FacilitatiInternareBuilder()
                .setHasPatRabatabil(true)
                .setHasPapuciDeCamera(true)
                .build();
        System.out.println(facilitatiInternare.toString());


    }
}
