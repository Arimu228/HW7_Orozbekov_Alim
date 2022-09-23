public abstract class Hero implements HavingSuperAbility {

    public String applyAbilityHero;

    private int healthHero;

    public int getHealthHero() {
        return healthHero;
    }

    public void setHealthHero(int healthHero) {
        this.healthHero = healthHero;
    }

    public int getDamageHero() {
        return DamageHero;
    }

    public void setDamageHero(int damageHero) {
        DamageHero = damageHero;
    }

    public String getTypeOfSuperAbilityHero() {
        return TypeOfSuperAbilityHero;
    }

    public void setTypeOfSuperAbilityHero(String typeOfSuperAbilityHero) {
        TypeOfSuperAbilityHero = typeOfSuperAbilityHero;
    }

    private int DamageHero;
    private String TypeOfSuperAbilityHero;


    public abstract void applyAbilityHero();
}
