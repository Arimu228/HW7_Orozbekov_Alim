public class Magic extends Hero implements HavingSuperAbility{




    @Override
    public void applyAbility() {
        System.out.println("Magic применил супер способнисть MAGIC DAMAGE");
    }

    @Override
    public String applyAbilityHero(String ability) {
        return "Magic применил супер способнисть MAGIC DAMAGE" ;
    }

    @Override
    public void applyAbilityHero() {
        System.out.println("Magic применил супер способнисть MAGIC DAMAGE");

    }
}
