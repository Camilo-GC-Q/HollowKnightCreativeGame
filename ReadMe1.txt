My game's theme is that of the game Hollow Knight. It is a metroidvania (genre of video game) where 
the player explores the world of Hollownest and embarks on a journey to defeat the Radiance which
has unleashed a plague on the land.

The enemy in my game is a Flukemarm, one of the many bosses in the game.

I changed two things:

1. Added a new entity called a grub which when a certain number of them are collected, the player wins the game and is shown the appropriate 
ending screen. The grub entity acts like a normal entity except it has a separate point system from that of the original game, which is 
displayed in the title bar and is updated according to how many grubs are collected.

2. Whenever the player collects a grub, the speed of their character is momentarily increased. This is according to a set number of tickselapsed. 

Additional contributions besides the main two are: adding a new point system, adding a new win condition, changing the images for the get, rareget, and 
avoid to fit the Hollow Knight theme, and adding additional background images shown for win/loss scenarios.

Bugs: I encountered a weird situation only after changing the images of the get, rareget, and avoid entities where the rate at which each 
entity spawned was at least 2 times slower than normal. The only solution I found was to adjust the spawnEntities function and make my 
own rate of spawning.

Win Conditions: 
Collect 5 grubs
Collect 300 Geo

Lose Condition:
HP getting to 0 from running into Flukemarm minions.

Sources: 

Grub Entity Image:
https://www.google.com/url?sa=i&url=https%3A%2F%2Fdayoftheshirt.com%2Fshirts%2F120335%2Fhollow-knight-grub-vector-redbubble&psig=AOvVaw3DNreYzS-ZdnT2quyjNbrL&ust=1682968601297000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCMifjt-o0v4CFQAAAAAdAAAAABAE

Soul Entity Image (Formerly RareGet):
https://www.google.com/url?sa=i&url=https%3A%2F%2Fhollowknight.fandom.com%2Fwiki%2FKingsoul&psig=AOvVaw2kCkEsUAL8qWzpKA8FuGD0&ust=1682968712283000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCKCd_5Op0v4CFQAAAAAdAAAAABAE

Geo Entity Image (Formerly Get):
https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.redbubble.com%2Fi%2Fsticker%2FGeo-by-Matte-Rainbow%2F47834199.EJUG5&psig=AOvVaw2Yw0hINy_NyMnK34Pfoaar&ust=1682968749759000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCPDk4KWp0v4CFQAAAAAdAAAAABAI

Flukemon Entity Image (Formerly Avoid)
https://www.google.com/url?sa=i&url=https%3A%2F%2Fhollowknight.fandom.com%2Fwiki%2FFlukemon&psig=AOvVaw2aOZIiE_dqD_KF8sCUTVHA&ust=1682968807438000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJDZxMGp0v4CFQAAAAAdAAAAABAE

Hollow Knight Entity Image (Formerly Player)
https://static.wikia.nocookie.net/hollowknight/images/4/47/The_Knight_Idle.png/revision/latest?cb=20190618162622

Flukemarm In-Game Background Image
https://www.google.com/url?sa=i&url=https%3A%2F%2Ftwitter.com%2Fmossbag69%2Fstatus%2F1228718619489640455&psig=AOvVaw06Q3bG9QuviUgP9bCuloQh&ust=1682971777423000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCMC9ysm00v4CFQAAAAAdAAAAABAE

Hollow Knight Splash Image (formerly SplashImage.gif)
https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.reddit.com%2Fr%2FHollowKnight%2Fcomments%2Fkybyw7%2Fhollow_knight_title_screen_backgrounds%2F&psig=AOvVaw1fRbmsou-fFzLtCJe27sDh&ust=1682971555945000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCMjE79-z0v4CFQAAAAAdAAAAABAE

You Win from Geo and You Win from Grubs Background Image
https://www.google.com/url?sa=i&url=https%3A%2F%2Fhollowknight.fandom.com%2Fwiki%2FMenu_Styles_%2528Hollow_Knight%2529&psig=AOvVaw1fRbmsou-fFzLtCJe27sDh&ust=1682971555945000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCMjE79-z0v4CFQAAAAAdAAAAABAJ

You Lose Background Image
https://www.google.com/url?sa=i&url=https%3A%2F%2Fhollowknight.fandom.com%2Fwiki%2FMenu_Styles_%2528Hollow_Knight%2529&psig=AOvVaw1fRbmsou-fFzLtCJe27sDh&ust=1682971555945000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCMjE79-z0v4CFQAAAAAdAAAAABAR
