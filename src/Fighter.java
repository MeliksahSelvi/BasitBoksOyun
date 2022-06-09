public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name,int damage,int health,int weight,int dodge){

        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }

    int Krose(Fighter enemy){

        double isDodge=Math.random()*100;

        if(enemy.dodge < isDodge){

            System.out.println(this.name+" => "+enemy.name+ " "+this.damage+" vurdu.");
            return this.damage;
        }
        else{

            System.out.println(this.name+" => "+enemy.name+ " krose salladi ama "+enemy.name+" blokladi.");
            return 0;
        }

    }

    boolean isWin(Fighter enemy){

        if(enemy.health<=0){

            System.out.println("Maci "+this.name+" kazandi.");
            return true;
        }

        else{
            return false;
        }
    }
}
