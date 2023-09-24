from pytube import YouTube

# URL of the YouTube video you want to download
video_url = "https://www.youtube.com/watch?v=VIDEO_ID"

# Create a YouTube object
yt = YouTube(video_url)

# Choose the stream with the highest resolution (usually, stream order is from highest to lowest resolution)
video_stream = yt.streams.get_highest_resolution()

# Download the video to the current working directory
video_stream.download()

print("Video downloaded successfully!")
