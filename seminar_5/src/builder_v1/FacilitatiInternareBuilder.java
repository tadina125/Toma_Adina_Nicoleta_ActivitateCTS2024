package builder_v1;

public class FacilitatiInternareBuilder implements Builder{
    private boolean hasPatRabatabil;
    private boolean hasMicDeJun;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatDeInterior;

    public FacilitatiInternareBuilder() {
        this.hasPatRabatabil = false;
        this.hasMicDeJun = false;
        this.hasPapuciDeCamera = false;
        this.hasHalatDeInterior = false;
    }

    @Override
    public FacilitatiInternare build() {
        return new FacilitatiInternare(hasPatRabatabil, hasMicDeJun, hasPapuciDeCamera, hasHalatDeInterior);
    }

    public FacilitatiInternareBuilder setHasPatRabatabil(boolean patRabatabil){
        this.hasPatRabatabil = patRabatabil;
        return this;
    }

    public FacilitatiInternareBuilder setHasMicDeJun(boolean micDeJun){
        this.hasMicDeJun = micDeJun;
        return this;
    }

    public FacilitatiInternareBuilder setHasPapuciDeCamera(boolean papuciDeCamera){
        this.hasPapuciDeCamera = papuciDeCamera;
        return this;
    }

    public FacilitatiInternareBuilder setHasHalatDeInterior(boolean halatDeInterior){
        this.hasHalatDeInterior = halatDeInterior;
        return this;
    }
}
