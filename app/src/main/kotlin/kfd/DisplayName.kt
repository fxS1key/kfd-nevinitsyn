package kfd

fun displayName(name: String?): String {
    if (name == null || name.trim() == "")
        return "Гость"
    return name.trim()
}

