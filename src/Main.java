public class Main {
    public static void main(String[] args) {

        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrio warrio = new Warrio();

        Hero[] heroes = {magic, medic, warrio};
        medic.setHealPoints(25);
        for (int i = 0; i < heroes.length; i++) {
         if (heroes[i] instanceof Medic){
             medic.increaseExperience();
             medic.getHealPoints();
         }
            heroes[i].applyAbilityHero();

        }
    }


}