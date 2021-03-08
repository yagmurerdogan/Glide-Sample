# Glide-Sample
Easy usage of Glide 🦸🏻‍♀️
<table>
  <tr>
    <td>⚡️ GIF in imageView </td>  
    <td>⚡️ 3 Different Views </td>
  </tr>
  <tr>
    <td valign="top"><img src="https://user-images.githubusercontent.com/47380312/110306412-d9fbfe00-800e-11eb-8178-bba60cd09f9e.gif"></td>
    <td valign="top"><img src="https://user-images.githubusercontent.com/47380312/108607057-0f79d800-73cf-11eb-8b85-32a810a4168a.JPG"></td>
  </tr>
 </table>
 
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
