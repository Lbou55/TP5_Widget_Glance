package com.example.tp5_widget

import android.content.Context
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class MesureWidgetReceiver : GlanceAppWidgetReceiver() {

    override val glanceAppWidget: GlanceAppWidget = MesureWidget()

    // Appelée quand le PREMIER widget est posé
    override fun onEnabled(context: Context) {
        super.onEnabled(context)
        WidgetWorker.planifier(context)
    }

    // Appelée quand le DERNIER widget est retiré
    override fun onDisabled(context: Context) {
        super.onDisabled(context)
        WidgetWorker.annuler(context)
    }
}
