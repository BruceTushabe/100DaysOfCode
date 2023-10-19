from rembg import remove
from PIL import Image
input_path = 'rem.jpg'
out_path = 'output.png'
input = Image.open(input_path)
output = remove(input)
output.save(out_path)

