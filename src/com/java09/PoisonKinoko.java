package com.java09;

public class PoisonKinoko extends Kinoko {
    private int poisonCount = 5;
    
    // getPoisonCount getter&setter는 내부의 작업이니까 안써도 됨 
    
    public PoisonKinoko(char suffix) {
        super(suffix);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void attack(Hero hero) {
        // TODO Auto-generated method stub
        super.attack(hero);
        if (poisonCount != 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            int beforeAttackHp = hero.getHp();
            hero.setHp(beforeAttackHp * 4 / 5);
            System.out.println(beforeAttackHp - hero.getHp()  + "포인트의 데미지");
            poisonCount -= 1;
        }
    }
    
}
