package core.basesyntax;

class BulldozerTest extends MachineTest {

    @Override
    public void doWork() {
        System.out.println("Bulldozer started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working.");
    }
}