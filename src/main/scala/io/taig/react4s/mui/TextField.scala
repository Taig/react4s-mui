package io.taig.react4s.mui

import com.github.ahnfelt.react4s._
import io.taig.react4s.mui.facade.Mui

import scala.scalajs.js

object TextField {
    def apply(
        key:                      Option[String]                                     = None,
        ref:                      Option[Any ⇒ Unit]                                 = None,
        className:                js.UndefOr[String]                                 = js.undefined,
        defaultValue:             js.UndefOr[String]                                 = js.undefined,
        disabled:                 js.UndefOr[Boolean]                                = js.undefined,
        errorStyle:               js.UndefOr[Css]                                    = js.undefined,
        errorText:                js.UndefOr[String]                                 = js.undefined,
        floatingLabelFixed:       js.UndefOr[Boolean]                                = js.undefined,
        floatingLabelFocusStyle:  js.UndefOr[Css]                                    = js.undefined,
        floatingLabelShrinkStyle: js.UndefOr[Css]                                    = js.undefined,
        floatingLabelStyle:       js.UndefOr[Css]                                    = js.undefined,
        floatingLabelText:        js.UndefOr[String]                                 = js.undefined,
        fullWidth:                js.UndefOr[Boolean]                                = js.undefined,
        hintStyle:                js.UndefOr[Css]                                    = js.undefined,
        hintText:                 js.UndefOr[String]                                 = js.undefined,
        id:                       js.UndefOr[String]                                 = js.undefined,
        inputStyle:               js.UndefOr[Css]                                    = js.undefined,
        multiLine:                js.UndefOr[Boolean]                                = js.undefined,
        name:                     js.UndefOr[String]                                 = js.undefined,
        onChange:                 js.UndefOr[js.Function2[TouchEvent, String, Unit]] = js.undefined,
        rows:                     js.UndefOr[Int]                                    = js.undefined,
        rowsMax:                  js.UndefOr[Int]                                    = js.undefined,
        style:                    js.UndefOr[Css]                                    = js.undefined,
        textareaStyle:            js.UndefOr[Css]                                    = js.undefined,
        `type`:                   js.UndefOr[String]                                 = js.undefined,
        underlineDisabledStyle:   js.UndefOr[Css]                                    = js.undefined,
        underlineFocusStyle:      js.UndefOr[Css]                                    = js.undefined,
        underlineShow:            js.UndefOr[Boolean]                                = js.undefined,
        underlineStyle:           js.UndefOr[Css]                                    = js.undefined,
        value:                    js.UndefOr[String]                                 = js.undefined
    )( children: Tag* ): DynamicComponent = {
        val props = js.Dictionary(
            "className" → className,
            "defaultValue" → defaultValue,
            "disabled" → disabled,
            "errorStyle" → errorStyle,
            "errorText" → errorText,
            "floatingLabelFixed" → floatingLabelFixed,
            "floatingLabelShrinkStyle" → floatingLabelShrinkStyle,
            "floatingLabelStyle" → floatingLabelStyle,
            "floatingLabelText" → floatingLabelText,
            "fullWidth" → fullWidth,
            "hintStyle" → hintStyle,
            "hintText" → hintText,
            "id" → id,
            "inputStyle" → inputStyle,
            "multiLine" → multiLine,
            "name" → name,
            "onChange" → onChange,
            "rows" → rows,
            "rowsMax" → rowsMax,
            "style" → style,
            "textareaStyle" → textareaStyle,
            "type" → `type`,
            "underlineDisabledStyle" → underlineDisabledStyle,
            "underlineFocusStyle" → underlineFocusStyle,
            "underlineShow" → underlineShow,
            "underlineStyle" → underlineStyle,
            "value" → value
        )

        DynamicComponent( Mui.TextField, props, children, key, ref )
    }
}