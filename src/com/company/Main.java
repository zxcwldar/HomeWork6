package com.company;

public class Main {

    public static void main(String[] args) {
        Boss leonid = new Boss();
        leonid.setDamage( 56);
        leonid.setHealth( 1200);
        leonid.weapon.setTypWeapon( " Огнестрельное");
        leonid.weapon.setNameWeapon( "M4A16");
        System.out.println( " Здоровье Босса" + leonid.health + " Урон босса" + leonid.damage + " Имя оружия " + leonid.weapon.getNameWeapon() + " Вид оружия " + leonid.weapon.getTypWeapon()  );





    }
}
