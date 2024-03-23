package builder_v1;

public class FacilitatiInternare {
    private boolean hasPatRabatabil;
    private boolean hasMicDeJun;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatDeInterior;


    public FacilitatiInternare(boolean hasPatRabatabil, boolean hasMicDeJun, boolean hasPapuciDeCamera, boolean hasHalatDeInterior) {
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDeJun = hasMicDeJun;
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        this.hasHalatDeInterior = hasHalatDeInterior;
    }

    public boolean isHasPatRabatabil() {
        return hasPatRabatabil;
    }

    public void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    public boolean isHasMicDeJun() {
        return hasMicDeJun;
    }

    public void setHasMicDeJun(boolean hasMicDeJun) {
        this.hasMicDeJun = hasMicDeJun;
    }

    public boolean isHasPapuciDeCamera() {
        return hasPapuciDeCamera;
    }

    public void setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
    }

    public boolean isHasHalatDeInterior() {
        return hasHalatDeInterior;
    }

    public void setHasHalatDeInterior(boolean hasHalatDeInterior) {
        this.hasHalatDeInterior = hasHalatDeInterior;
    }

    @Override
    public String toString() {
        return "FacilitatiInternare{" +
                "hasPatRabatabil=" + hasPatRabatabil +
                ", hasMicDeJun=" + hasMicDeJun +
                ", hasPapuciDeCamera=" + hasPapuciDeCamera +
                ", hasHalatDeInterior=" + hasHalatDeInterior +
                '}';
    }
}
