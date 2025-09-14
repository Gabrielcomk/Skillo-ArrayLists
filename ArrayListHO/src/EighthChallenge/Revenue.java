package EighthChallenge;

public class Revenue {
    private String name;
    private int preparationTime;

    public Revenue(String name, int preparationTime) {
        this.name = name;
        this.preparationTime = preparationTime;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    @Override
    public String toString() {
        return "--------------------" +
        "\nName:" + name +
                "\nPreparation Time: " + preparationTime + " minutes\n";
    }
}
