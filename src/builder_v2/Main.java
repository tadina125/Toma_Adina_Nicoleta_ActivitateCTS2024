package builder_v2;

public class Main {
    public static void main(String[] args) {
        FacilitatiInternare.FacilitatiInternareBuilder facilitatiBuilder = new FacilitatiInternare.FacilitatiInternareBuilder();
        FacilitatiInternare facilitatiInternare = facilitatiBuilder
                .setHasPatRabatabil(true)
                .setHasPapuciDeCamera(true)
                .build();
        System.out.println(facilitatiInternare.toString());


    }
}
