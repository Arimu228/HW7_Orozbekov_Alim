public class Warrio extends Hero implements HavingSuperAbility{


    @Override
    public void applyAbility() {
        System.out.println("Warrio применил супер способнисть CRITICAL DAMAGE");
    }

    @Override
    public String applyAbilityHero(String ability) {
        return"Warrio применил супер способнисть CRITICAL DAMAGE" ;
    }

    @Override
    public void applyAbilityHero() {
        System.out.println("Warrio применил супер способнисть CRITICAL DAMAGE");

    }
}

