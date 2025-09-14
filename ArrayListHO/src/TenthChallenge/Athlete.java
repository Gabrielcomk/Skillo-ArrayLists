package TenthChallenge;

public class Athlete {
    private String name;
    private String modality;
    private float score;

    public Athlete(String name, String modality, float score) {
        this.name = name;
        this.modality = modality;
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "--------------------" +
                "\nName: " + name +
                "\nmodality: " + modality +
                "\nscore: " + score + "\n";
    }
}
