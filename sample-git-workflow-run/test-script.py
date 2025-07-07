import sys

def main():
    if len(sys.argv) != 2:
        print("❌ Missing argument. Use 'pass' or 'fail'.")
        sys.exit(1)

    value = sys.argv[1].strip().lower()

    if value == "pass":
        print("✅ Hello from pass! Exiting successfully.")
        sys.exit(0)
    elif value == "fail":
        print("❌ Hello from fail! Exiting with failure.")
        sys.exit(1)
    else:
        print(f"⚠️ Invalid argument '{value}'. Use 'pass' or 'fail'.")
        sys.exit(1)

if __name__ == "__main__":
    main()
