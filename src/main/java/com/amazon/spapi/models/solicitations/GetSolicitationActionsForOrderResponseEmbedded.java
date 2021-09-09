package com.amazon.spapi.models.solicitations;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetSolicitationActionsForOrderResponseEmbedded
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetSolicitationActionsForOrderResponseEmbedded {
    @SerializedName("actions")
    private List<GetSolicitationActionResponse> actions = new ArrayList<GetSolicitationActionResponse>();

    public GetSolicitationActionsForOrderResponseEmbedded actions(List<GetSolicitationActionResponse> actions) {
        this.actions = actions;
        return this;
    }

    public GetSolicitationActionsForOrderResponseEmbedded addActionsItem(GetSolicitationActionResponse actionsItem) {
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Get actions
     *
     * @return actions
     **/
    @Schema(required = true, description = "")
    public List<GetSolicitationActionResponse> getActions() {
        return actions;
    }

    public void setActions(List<GetSolicitationActionResponse> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSolicitationActionsForOrderResponseEmbedded getSolicitationActionsForOrderResponseEmbedded = (GetSolicitationActionsForOrderResponseEmbedded) o;
        return Objects.equals(this.actions, getSolicitationActionsForOrderResponseEmbedded.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSolicitationActionsForOrderResponseEmbedded {\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
