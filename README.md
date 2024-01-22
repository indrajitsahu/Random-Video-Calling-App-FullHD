# Connect -> Random-Video-Calling-App-FullHD

This is a simple video calling app called **Connect**. This enables you to connect with peers with secure connection without any mediatary server.

<img src="https://user-images.githubusercontent.com/76425862/157926320-403dfdce-8929-48f4-826d-eb2164a9fc3b.jpg" width="300" height="400" /> 

![img2](https://github.com/indrajitsahu/Random-Video-Calling-App-FullHD/assets/76425862/39756adb-2daa-4038-91da-0cadd0525673)

<img src="https://user-images.githubusercontent.com/76425862/157926342-38c616eb-338b-4049-afe5-d9b494d82067.jpg" width="300" height="400" />



This app directly connect with a peer, and for initial connection it requires a server to get the data but after getting the connection data, it can able to make path by it's own.

This app using WebRTC API which uses server signaling and NATs for both devices internally. The actual RTC process is bit complicated, for that reason I use **PeerJS** for simplifying the connection process instead for being complicated for the application and user itself.

## Features:
- Google Sign-In Integration
- Real-time Database using Firebase
- Admob Reward Ads Integration
- Animation from lottiefiles.com
- Video coins system (per video call costs you 5 coins)
- Automatic room creation for a new video call in the database where the two peers will connect
- Firebase Authentication Integration
