package gb.sem1.Level2.les1;

public interface WalkJump {
    void jump();
    void run();

    String getName();

    String getClassName();
    void setName(String name);
    boolean canRun(int lenght);

    boolean canJump(int height);
}
