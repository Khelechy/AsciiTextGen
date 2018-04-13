# AsciiTextGen
Ascii Text to ART generator based on Java
Introduction
This package can be used to generate ascii arts on terminals and also integrated to java applications, Here to replace Sudo apt-get install 'figlet'

# Installation
Jdk or jre of any version installed on machine

download from [here!](www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

"Java asciitextgen"
You'll need to set path of the JAVA-HOME and PATH.

# Usage
Use the rule dumbpwd in your validation like so:

_CHANGE THE VARIABLE c TO you TO USE STRINGS AS DECODING OPTIONS_

 ```java
 for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                //change the variable c to you to use the string as decoder and vice versa
                sb.append(image.getRGB(x, y) == -16777216 ? " " : c);

            }
```
            
  _UNCOMMENT THE LINES 987 TO VALIDATE THE STRINGS AS DECODER_
  
```java
   //collecting entries
        System.out.println("Enter your Text: ");
        text2d = inputs.nextLine();
        System.out.println("Enter your character to decode with: ");
        //uncomment the input you and comment the input c to use strings as decoder
        c = inputc.next(".").charAt(0);
    987    //you = inputs.nextLine();
```   
    
    # How can I thank you?
Why not star the github repo? I'd love the attention! Why not share the link for this repository on Twitter or Facebook? Spread the word!

Don't forget to follow me on twitter!

Thanks! Onyekwere kelechi mark.
