$(document).ready(function(){
  var buttoncolors=["red","orange","cyan","yellow"];

    var started=false;
    var level=0;
    var i=0;
    var gamepattern=[];
    var userpressed=[];
    $(document).keypress(function(){


      if (!started) {
          $("#level-title").text("Level " + level);
          nextSequence();
          started = true;
        }
  });
    $(".btn").click(function(){

      var chosen= $(this).attr("id")
   
      userpressed.push(chosen)
   
   
      playsound(chosen);
       
       
       $("."+chosen).addClass("pressed");
       
       setTimeout(function(){
       
           $("."+chosen).removeClass("pressed");
       
       
       });
   
       checksequnce(userpressed.length-1)
       
       
   
   })

   

    var nextSequence = function(){
        userpressed=[];
         ++level;
  
       $("h1").text("Level "+level);
       

      var randomnumber=(Math.random()/3)*10;
      var finalnum=Math.floor(randomnumber);
      
      var randomchosencolor= buttoncolors[finalnum];
      
      gamepattern.push(randomchosencolor);
      
    
          setTimeout(function(){

            playsound(randomchosencolor);
            $("."+randomchosencolor).addClass("pressed");
      
            setTimeout(function(){
            
                $("."+randomchosencolor).removeClass("pressed");
            
            
            });

          },1000)
        }
        



var checksequnce= function(currentLevel){

    if (gamepattern[currentLevel] === userpressed[currentLevel]) {

        console.log("success");
  
        //4. If the user got the most recent answer right in step 3, then check that they have finished their sequence with another if statement.
        if (userpressed.length === gamepattern.length){
          
          //5. Call nextSequence() after a 1000 millisecond delay.
          setTimeout(function () {
            nextSequence();
          }, 1000);
  
        }
  
      } else {
  
        var audio = new Audio("./sounds/wrong.mp3");
        audio.play();

          $("h1").text("Wrong!!!..Press Any Key To Restart")

          $("body").addClass("game-over");

          setTimeout(function(){

            $("body").removeClass("game-over");

          },200)
          
  startover();
           
          
      }




    }
    
    var playsound=function(name){

      var audio = new Audio("./sounds/"+name+".mp3");
      audio.play();
    
    }
    var startover=function(){
    
      level=0;
      started=false;
      gamepattern=[];
      
        } 
 

});



