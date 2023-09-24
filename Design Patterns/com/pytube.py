import pytube
from pytube import YouTube

# Ask the user to enter url of a youtube video

video_url = input('Enter url: ')


# Create instance of Youtube video

video_instance = pytube.YouTube(video_url)

stream = video_instance.streams.get_highest_resolution()

#download

stream.download()



