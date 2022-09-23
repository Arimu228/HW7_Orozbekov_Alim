public class Medic extends Hero{

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    private  int healPoints;

    @Override
    public void applyAbility() {
        System.out.println("Medic применил супер способнисть MEDICINE HELP");
    }

    @Override
    public String applyAbilityHero(String ability) {
        return "Medic применил супер способнисть MEDICINE HELP" ;
    }

    @Override
    public void applyAbilityHero() {
        System.out.println("Medic применил супер способнисть MEDICINE HELP");

    }
    public int increaseExperience(){
        System.out.println(applyAbilityHero + 10);
        return increaseExperience();
    }
}
