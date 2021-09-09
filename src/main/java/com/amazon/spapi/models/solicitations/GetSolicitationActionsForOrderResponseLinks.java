package com.amazon.spapi.models.solicitations;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetSolicitationActionsForOrderResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-01T00:00:00.000+08:00[Asia/Shanghai]")
public class GetSolicitationActionsForOrderResponseLinks {
    @SerializedName("self")
    private LinkObject self = null;
    @SerializedName("actions")
    private List<LinkObject> actions = new ArrayList<LinkObject>();

    public GetSolicitationActionsForOrderResponseLinks self(LinkObject self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     *
     * @return self
     **/
    @Schema(required = true, description = "")
    public LinkObject getSelf() {
        return self;
    }

    public void setSelf(LinkObject self) {
        this.self = self;
    }

    public GetSolicitationActionsForOrderResponseLinks actions(List<LinkObject> actions) {
        this.actions = actions;
        return this;
    }

    public GetSolicitationActionsForOrderResponseLinks addActionsItem(LinkObject actionsItem) {
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Eligible actions for the specified amazonOrderId.
     *
     * @return actions
     **/
    @Schema(required = true, description = "Eligible actions for the specified amazonOrderId.")
    public List<LinkObject> getActions() {
        return actions;
    }

    public void setActions(List<LinkObject> actions) {
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
        GetSolicitationActionsForOrderResponseLinks getSolicitationActionsForOrderResponseLinks = (GetSolicitationActionsForOrderResponseLinks) o;
        return Objects.equals(this.self, getSolicitationActionsForOrderResponseLinks.self) &&
                Objects.equals(this.actions, getSolicitationActionsForOrderResponseLinks.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSolicitationActionsForOrderResponseLinks {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
