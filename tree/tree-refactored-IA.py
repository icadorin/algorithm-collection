def print_pyramid(height: int):
    for i in range(height):
        stars = "*" * (2 * i + 1)
        print(f"{' ' * (height - i - 1)}{stars}")

def print_trunk(width: int):
    trunk = "*" * 4
    total_spaces = width - len(trunk)
    half_spaces = total_spaces // 2
    
    for i in range(3):
        spaces = " " * half_spaces
        print(spaces + trunk)

pyramid_height = 10
trunk_width = 19

print("\n")

print_pyramid(pyramid_height)
print_trunk(trunk_width)
