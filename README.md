<h1 align="center">Glide Sample</h1>

###  🔮 Easy usage of Glide
###  📒 [Medium Blog!](https://medium.com/hepsiburadatech/glide-k%C3%BCt%C3%BCphanesi-1de3e68d7f21) 

<p align="center">
<img src="https://user-images.githubusercontent.com/47380312/110306412-d9fbfe00-800e-11eb-8178-bba60cd09f9e.gif" width="250" height="500"/>
<img src="https://user-images.githubusercontent.com/47380312/108607057-0f79d800-73cf-11eb-8b85-32a810a4168a.JPG" width="250" height="500"/>
</p>
 
## ✨ For use Glide
### Step 1 -> Add implements to build.gradle file in module level
`implementation 'com.github.bumptech.glide:glide:4.12.0'`

`annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'`

### Step 2 -> Get uses permission for internet from manifest file
`<uses-permission android:name="android.permission.INTERNET"/>`
### Step 3 -> Be sure that these are exist in build.gradle file in project level
`repositories {
        google()
        jcenter()
    }`
### Now you are able to use Glide! 
