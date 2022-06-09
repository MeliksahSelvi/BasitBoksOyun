public class Match {

    Fighter f1;
    Fighter f2;
    Fighter firstHit;
    Fighter secondHit;
    int minWeight;
    int maxWeight;
    double ilkHit;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){

        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void Versus(){

        int durum=1;

        if(this.isCheck()){

            ilkHit=Math.random()*100;

            if(ilkHit>0 && ilkHit<51){
                firstHit=f1;
                secondHit=f2;
                durum++;
            }

            if(ilkHit>50 && ilkHit<101){
                firstHit=f2;
                secondHit=f1;
                durum--;
            }

            while(true){

                this.secondHit.health-=this.firstHit.Krose(secondHit);

                if(firstHit.isWin(secondHit)){
                    break;
                }

                this.firstHit.health-=this.secondHit.Krose(firstHit);

                if(secondHit.isWin(firstHit)){
                    break;
                }

                System.out.println(firstHit.name+" Saglik :"+firstHit.health);
                System.out.println(secondHit.name+" Saglik :"+secondHit.health);
            }

            if(durum==2){

                f1=firstHit;
                f2=secondHit;
            }
            else{

                f1=secondHit;
                f2=firstHit;
            }
        }
        else{

            System.out.println("Sikletleri Uyusmuyor!");
        }
    }



    boolean isCheck(){
        int isUygun=0;

        if(this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight)
            isUygun++;

        if(this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight)
            isUygun++;

        if(isUygun==2)
            return true;
        else
            return false;
    }
}
