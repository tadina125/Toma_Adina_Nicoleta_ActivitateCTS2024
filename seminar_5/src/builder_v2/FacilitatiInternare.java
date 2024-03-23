package builder_v2;

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

    public boolean isHasMicDeJun() {
        return hasMicDeJun;
    }

    public boolean isHasPapuciDeCamera() {
        return hasPapuciDeCamera;
    }

    public boolean isHasHalatDeInterior() {
        return hasHalatDeInterior;
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

    public static class FacilitatiInternareBuilder implements Builder{
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

        @Override
        public FacilitatiInternare build() {
            return new FacilitatiInternare(hasPatRabatabil, hasMicDeJun, hasPapuciDeCamera, hasHalatDeInterior);
        }

        @Override
        public String toString() {
            return "FacilitatiInternareBuilder{" +
                    "hasPatRabatabil=" + hasPatRabatabil +
                    ", hasMicDeJun=" + hasMicDeJun +
                    ", hasPapuciDeCamera=" + hasPapuciDeCamera +
                    ", hasHalatDeInterior=" + hasHalatDeInterior +
                    '}';
        }


    }
}
