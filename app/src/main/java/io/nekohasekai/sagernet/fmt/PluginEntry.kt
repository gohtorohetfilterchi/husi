package io.nekohasekai.sagernet.fmt

import io.nekohasekai.sagernet.R
import io.nekohasekai.sagernet.SagerNet

enum class PluginEntry(
    val pluginId: String,
    val displayName: String,
    val packageName: String, // for play and f-droid page
    val downloadSource: DownloadSource = DownloadSource()
) {
    TrojanGo(
        "trojan-go-plugin",
        SagerNet.application.getString(R.string.action_trojan_go),
        "io.nekohasekai.sagernet.plugin.trojan_go",
        DownloadSource(
            fdroid = false,
            downloadLink = "https://github.com/SagerNet/SagerNet/releases?q=trojan-go"
        )
    ),
    MieruProxy(
        "mieru-plugin",
        SagerNet.application.getString(R.string.action_mieru),
        "moe.matsuri.exe.mieru",
        DownloadSource(
            fdroid = false,
            downloadLink = "https://github.com/MatsuriDayo/plugins/releases?q=mieru"
        )
    ),
    NaiveProxy(
        "naive-plugin",
        SagerNet.application.getString(R.string.action_naive),
        "io.nekohasekai.sagernet.plugin.naive",
        DownloadSource(
            fdroid = false,
            downloadLink = "https://github.com/AntiNeko/sing-plugin/releases?q=naive"
        )
    ),
    Hysteria(
        "hysteria-plugin",
        SagerNet.application.getString(R.string.action_hysteria),
        "moe.matsuri.exe.hysteria",
        DownloadSource(
            fdroid = false,
            downloadLink = "https://github.com/MatsuriDayo/plugins/releases?q=Hysteria"
        )
    ),
    Hysteria2(
        "hysteria2-plugin",
        SagerNet.application.getString(R.string.action_hysteria)+"2",
        "fr.husi.plugin.hysteria2",
        DownloadSource(
            fdroid = false,
            downloadLink = "https://github.com/xchacha20-poly1305/husi/releases?q=Hysteria2"
        )
    ),
    ;

    data class DownloadSource(
        val fdroid: Boolean = true,
        val downloadLink: String = "https://github.com/xchacha20-poly1305/husi/releases"
    )

    companion object {

        fun find(name: String): PluginEntry? {
            for (pluginEntry in enumValues<PluginEntry>()) {
                if (name == pluginEntry.pluginId) {
                    return pluginEntry
                }
            }
            return null
        }

    }

}